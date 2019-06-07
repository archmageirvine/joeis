package irvine.oeis.a005;

import irvine.math.expression.Derivative;
import irvine.math.expression.Expression;
import irvine.math.expression.Identifier;
import irvine.math.expression.LiteralZ;
import irvine.math.expression.Power;
import irvine.math.expression.Substitution;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005168 n-th derivative of <code>x^x</code> at 1, divided by <code>n</code>.
 * @author Sean A. Irvine
 */
public class A005168 implements Sequence {

  private static final Identifier X = new Identifier("x");
  private static final LiteralZ LIT_ONE = new LiteralZ(Z.ONE);
  private Expression mExpr = new Power(X, X);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mExpr = new Derivative(mExpr, X).eval();
    final Expression eval = new Substitution(mExpr, X, LIT_ONE).eval();
    return new Z(eval.toString()).divide(mN);
  }
}
