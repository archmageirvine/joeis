package irvine.oeis.a005;

import irvine.math.expression.Add;
import irvine.math.expression.Expression;
import irvine.math.expression.Identifier;
import irvine.math.expression.LiteralZ;
import irvine.math.expression.Sircon;
import irvine.math.expression.Sum;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005270.
 * @author Sean A. Irvine
 */
public class A005270 implements Sequence {

  private static final Expression ONE = Sircon.parse("1");
  private static final Identifier X = new Identifier("x");
  private static final Identifier Y = new Identifier("y");
  private static final Expression X_PLUS_Y = Add.create(X, Y);
  private static final Expression Y_PLUS_1 = Add.create(Y, LiteralZ.LIT_ONE);
  private Expression mExpr = null;
  private int mN = 0;

  @Override
  public Z next() {
    if (mExpr == null) {
      mExpr = ONE;
    } else {
      final Identifier zn = new Identifier("z" + ++mN);
      mExpr = new Sum(mExpr.substitute(Y, zn).substitute(X, Y), zn, Y_PLUS_1, X_PLUS_Y);
    }
    if (mN < 5) { // This just efficiency, faster to expand the sum for small cases only
      mExpr = mExpr.eval();
    }
    final Expression res = mExpr.substitute(X, ONE).substitute(Y, ONE).eval();
    if (!(res instanceof LiteralZ)) {
      throw new UnsupportedOperationException(res.toString() + " " + res.getClass());
    }
    return ((LiteralZ) res).value();
  }

}

