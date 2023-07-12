package irvine.oeis.a011;

import irvine.math.expression.Add;
import irvine.math.expression.Expression;
import irvine.math.expression.HyperbolicTangent;
import irvine.math.expression.Identifier;
import irvine.math.expression.Literal;
import irvine.math.expression.LiteralQ;
import irvine.math.expression.LiteralZ;
import irvine.math.expression.Multiply;
import irvine.math.expression.Power;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction1Sequence;

/**
 * A011859 Normalized sequence of cumulants formed from moments in a quantum many-body problem at its critical point.
 * @author Sean A. Irvine
 */
public class A011859 extends MemoryFunction1Sequence<Q> {

  /** Construct the sequence. */
  public A011859() {
    super(1);
  }

  private static final Identifier X = new Identifier("x");
  private static final LiteralQ NEG_HALF = new LiteralQ(Q.HALF.negate());
  private Expression mTanhDerivative = null;
  private Z mFours = Z.ONE;

  @Override
  protected Q compute(final int n) {
    // There is a fairly simple reduction formula:
    //
    // \int\frac{\sinh^{m}x}{\cosh^{n}x}\,dx=\frac{\sinh^{m-1}x}{(n-1)\cosh^{n-1}x}+\frac{m-1}{n-1}\int\frac{\sinh^{m-2}x}{\cosh^{n-2}x}\,dx
    //
    // the non-integral part goes to 0 for -infinity..infinity, hence
    //
    // \int\frac{\sinh^{m}x}{\cosh^{n}x=-infinity..infinity}\,dx=\frac{m-1}{n-1}\int\frac{\sinh^{m-2}x}{\cosh^{n-2}x=-infinity..infinity}\,dx
    //
    // Further n = m + 1, thus we get ratios 1/2, 3/4, 5/6, 7/8 etc.
    if (n == 0) {
      return Q.ONE;
    }
    return get(n - 1).multiply(2L * n - 1).divide(2L * n);
  }

  private Q integral(final int n) {
    // Want (1/Pi) * integral(tanh^n(x)/cosh(x), x=-infinity..infinity)
    // Note tanh = sinh / cosh so really want sinh^n(x) / cosh^{n+1}(x)
    // In our use of this n is always even -- but all odd values are 0 anyway
    return (n & 1) == 0 ? get(n / 2) : Q.ZERO;
  }

  private Q integral(final int r, final int s) {
    // Given r, s in tanh(x)^r * (1-tanh(x)^2)^s
    final int n = 2 * s + r;

    // Apply binomial expansion to s part
    Q sum = Q.ZERO;
    for (int k = 0; k <= s; ++k) {
      sum = sum.signedAdd((k & 1) == 0, integral(n + r + 2 * k).multiply(Binomial.binomial(s, k)));
    }
    return sum;
  }

  private Q split(final Expression t) {
    if (t instanceof Add) {
      return split(((Add) t).left()).add(split(((Add) t).right()));
    }
    // t is of the general form C * tanh(x)^r * (1-tanh(x)^2)^s, but
    // note that one of other of the tanh terms could be missing
    final Q c;
    final int r;
    final int s;
    // We care about C, r, s

    // Lots of convoluted logic to pull these out of the expression
    // Find C
    Expression e = t;
    if (e instanceof Multiply) {
      final Expression left = ((Multiply) e).left();
      if (left instanceof Literal) {
        // Left most term is the C we are looking for
        if (left instanceof LiteralQ) {
          c = ((LiteralQ) left).value();
        } else if (left instanceof LiteralZ) {
          c = new Q(((LiteralZ) left).value());
        } else {
          throw new UnsupportedOperationException(e.toString());
        }
        e = ((Multiply) e).right();
      } else {
        c = Q.ONE;
      }
    } else {
      c = Q.ONE;
    }

    // Find r
    if (e instanceof HyperbolicTangent) {
      r = 1;
      s = 0;
    } else if (e instanceof Add) {
      r = 0;
      s = 1;
    } else if (e instanceof Power) {
      final Expression u = ((Power) e).left();
      final int exponent = ((LiteralZ) ((Power) e).right()).value().intValueExact();
      if (u instanceof HyperbolicTangent) {
        r = exponent;
        s = 0;
      } else {
        r = 0;
        s = exponent;
      }
    } else {
      assert e instanceof Multiply;
      final Expression left = ((Multiply) e).left();
      if (left instanceof Power) {
        r = ((LiteralZ) ((Power) left).right()).value().intValueExact();
      } else {
        r = 1;
      }
      e = ((Multiply) e).right();
      // Find s
      if (e instanceof Add) {
        s = 1;
      } else {
        s = ((LiteralZ) ((Power) e).right()).value().intValueExact();
      }
    }
    //System.out.println("C=" + c + " r=" + r + " s=" + s + " t=" + t);
    return c.multiply(integral(r, s));
  }

  @Override
  public Z next() {
    mTanhDerivative = mTanhDerivative == null ? new HyperbolicTangent(X) : mTanhDerivative.diff(X);
    mFours = mFours.multiply(-4);
    // Deal with the leading -2 factor present in all terms for n > 1
    final Expression t = Multiply.create(NEG_HALF, mTanhDerivative).eval();
    //System.out.println("t=" + t);
    // t comprises a sum of terms of the form C * tanh^r x * (1-tanh^2 x)^s with n = 2 * s +r.
    // Final negate to compensate for the -2 multiply we did earlier
    return split(t).multiply(mFours).toZ().negate();
  }

}
