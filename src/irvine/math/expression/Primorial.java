package irvine.math.expression;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * An expression for primorials.
 * @author Sean A. Irvine
 */
public class Primorial extends AbstractExpression {

  private final Expression mExpr;
  private final boolean mCountPrimes;

  /**
   * Construct the primorial of an expression.
   * @param expr expression to compute primorial of
   * @param countPrimes true if the argument is number of primes rather than the maximum prime
   */
  public Primorial(final Expression expr, final boolean countPrimes) {
    mExpr = expr;
    mCountPrimes = countPrimes;
  }

  /**
   * Construct the primorial of an expression.
   * @param expr expression to compute primorial of
   */
  public Primorial(final Expression expr) {
    this(expr, false);
  }

  @Override
  public Expression performEval() {
    final Expression expr = mExpr.eval();
    if (expr instanceof Literal<?, ?>) {
      final Literal<?, ?> lit = (Literal) expr;
      if (lit.value() instanceof Z) {
        final long arg = ((Z) lit.value()).longValueExact();
        if (mCountPrimes) {
          return new LiteralZ(ZUtils.primorialCount(arg));
        } else {
          return new LiteralZ(Functions.PRIMORIAL.z(arg));
        }
      }
      throw new UnsupportedOperationException("Primorial on " + lit.ring());
    } else if (expr == mExpr) {
      return this;
    } else {
      return new Primorial(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Primorial(mExpr.substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    throw new UnsupportedOperationException("derivative of primorial");
  }

  @Override
  public int complexity() {
    return 1 + mExpr.complexity();
  }

  @Override
  public Precedence precedence() {
    return Precedence.FUNCTION;
  }

  @Override
  public boolean contains(final Expression expr) {
    return equals(expr) || mExpr.contains(expr);
  }

  @Override
  public String toString() {
    return ExpressionUtils.toString(mExpr) + "#";
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Primorial)) {
      return false;
    }
    final Primorial that = (Primorial) obj;
    return mExpr.equals(that.mExpr);
  }

  @Override
  public int hashCode() {
    return 17 * mExpr.hashCode();
  }
}
