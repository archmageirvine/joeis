package irvine.math.expression;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * An expression for a sigma summation.
 * @author Sean A. Irvine
 */
public class Sum extends AbstractExpression {

  private final Expression mExpr;
  private final Identifier mVariable;
  private final Expression mLower;
  private final Expression mUpper;

  /**
   * Construct a sigma summation.
   * @param expr expression to substitute into
   * @param variable variable to substitute
   * @param lower lower index
   * @param upper upper index
   */
  public Sum(final Expression expr, final Identifier variable, final Expression lower, final Expression upper) {
    mExpr = expr;
    mVariable = variable;
    mLower = lower;
    mUpper = upper;
  }

  // sum(k^p,k=0..n)
  private Expression sumOfPower(final int p, final Expression n) {
    if (p < 1) {
      throw new IllegalArgumentException();
    }
    final LiteralZ p1 = new LiteralZ(p + 1);
    final Expression n1 = Add.create(LiteralZ.LIT_ONE, n);
    Expression res = Divide.create(new Power(n1, p1), p1);
    final BernoulliSequence b = new BernoulliSequence(1);
    for (int k = 1; k <= p; ++k) {
      final Q bernoulli = b.nextQ();
      if (bernoulli.signum() != 0) {
        final Q coeff = bernoulli.multiply(Binomial.binomial(p, k)).divide(p - k + 1);
        res = Add.create(res, Multiply.create(new LiteralQ(coeff), new Power(n1, Subtract.create(p1, new LiteralZ(k)))));
      }
    }
    return res.eval();
  }

  @Override
  public Expression performEval() {
    // Part of the general strategy here is to expand out the sum into simple
    // terms that we know how to evaluate.

    // sum(c,k=lower..upper)
    if (!mExpr.contains(mVariable)) {
      return Multiply.create(mExpr, Add.create(Subtract.create(mUpper, mLower), LiteralZ.LIT_ONE)).eval();
    }
    // sum(A+B,k=lower..upper) = sum(A,k=lower..upper) + sum(B,k=lower..upper)
    if (mExpr instanceof Add) {
      final Add e = (Add) mExpr;
      return Add.create(new Sum(e.left(), mVariable, mLower, mUpper), new Sum(e.right(), mVariable, mLower, mUpper)).eval();
    }
    // sum(k,k=lower..upper) = (lower+upper)*(upper-lower+1)/2
    if (mExpr instanceof Identifier) {
      final Identifier var = (Identifier) mExpr;
      if (var.equals(mVariable)) {
        final Expression e1 = Add.create(mUpper, mLower);
        final Expression e2 = Add.create(Subtract.create(mUpper, mLower), LiteralZ.LIT_ONE);
        return Divide.create(Multiply.create(e1, e2), LiteralZ.LIT_TWO);
      }
    }
    // Explicit summation for integer literals
    if (mLower instanceof LiteralZ && mUpper instanceof LiteralZ) {
      final Z lim = ((LiteralZ) mUpper).value();
      Expression e = LiteralZ.LIT_ZERO;
      for (Z k = ((LiteralZ) mLower).value(); k.compareTo(lim) <= 0; k = k.add(1)) {
        e = Add.create(e, mExpr.substitute(mVariable, new LiteralZ(k)).eval());
      }
      return e.eval();
    }
    if (mExpr instanceof Multiply) {
      assert mExpr.contains(mVariable);
      final Expression left = ((Multiply) mExpr).left();
      final Expression right = ((Multiply) mExpr).right();
      if (!left.contains(mVariable)) {
        // sum(A*f(k),k=lower..upper)
        return Multiply.create(left, new Sum(right, mVariable, mLower, mUpper)).eval();
      } else if (!right.contains(mVariable)) {
        // sum(f(k)*A,k=lower..upper)
        return Multiply.create(right, new Sum(left, mVariable, mLower, mUpper)).eval();
      }
      // sum(f(k)*g(k),k=lower..upper)
      // Progress might still be possible by expanding
      final Expression expand = mExpr.expand();
      if (expand != mExpr) {
        return new Sum(expand, mVariable, mLower, mUpper).performEval();
      }
    }
    if (mExpr instanceof Power) {
      final Expression base = ((Power) mExpr).left();
      final Expression power = ((Power) mExpr).right();
      if (base.equals(mVariable) && power instanceof LiteralZ && ((LiteralZ) power).signum() > 0) {
        // sum(k^p,k=lower..upper), p>=1
        final int p = ((LiteralZ) power).value().intValueExact();
        Expression res = sumOfPower(p, mUpper);
        if (!LiteralZ.LIT_ZERO.equals(mLower)) {
          res = Subtract.create(res, sumOfPower(p, Subtract.create(mLower, LiteralZ.LIT_ONE)));
        }
        return res;
      }
      // todo there are other cases that could be handled here, e.g. sum(a^k,k)
      // Progress might still be possible by expanding
      final Expression expand = mExpr.expand();
      if (expand != mExpr) {
        return new Sum(expand, mVariable, mLower, mUpper).performEval();
      }
    }
    //System.out.println("Failed on: " + toString());
    return this;
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Sum(mExpr.substitute(var, value), mVariable, mLower.substitute(var, value).eval(), mUpper.substitute(var, value).eval());
  }

  @Override
  public Expression diff(final Identifier var) {
    if (var.equals(mVariable) || mLower.contains(var) || mUpper.contains(var)) {
      throw new UnsupportedOperationException("derivative of sum index variable or index value");
    }
    return new Sum(mExpr.diff(var).eval(), mVariable, mLower, mUpper).eval();
  }

  @Override
  public int complexity() {
    return 1 + mExpr.complexity() + mVariable.complexity() + mLower.complexity() + mUpper.complexity();
  }

  @Override
  public Precedence precedence() {
    return Precedence.FUNCTION;
  }

  @Override
  public boolean contains(final Expression expr) {
    return equals(expr) || mExpr.contains(expr) || mVariable.contains(expr) || mLower.contains(expr) || mUpper.contains(expr);
  }

  @Override
  public String toString() {
    return "sum(" + mExpr + ", " + mVariable + "=" + mLower + ".." + mUpper + ")";
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Sum)) {
      return false;
    }
    final Sum that = (Sum) obj;
    return mVariable.equals(that.mVariable) && mExpr.equals(that.mExpr) && mLower.equals(that.mLower) && mUpper.equals(that.mUpper);
  }

  @Override
  public int hashCode() {
    return 7 * mExpr.hashCode() + 3 * mVariable.hashCode() + 17 * mLower.hashCode() + mUpper.hashCode();
  }
}
