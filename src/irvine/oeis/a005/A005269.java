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
 * A005269 <code>a(n) =</code> number of length-n sequences s with <code>s[1]=1, s[2]=1, s[k-1] &lt;=s[k] &lt;= s[k-2]+s[k-1] (s</code> is called a sub-Fibonacci sequence of length <code>n)</code>.
 * @author Sean A. Irvine
 */
public class A005269 implements Sequence {

  private static final Expression ONE = Sircon.parse("1");
  private static final Identifier X = new Identifier("x");
  private static final Identifier Y = new Identifier("y");
  private static final Expression X_PLUS_Y = Add.create(X, Y);
  private Expression mExpr = null;
  private int mN = 0;

  @Override
  public Z next() {
    if (mExpr == null) {
      mExpr = ONE;
    } else {
      final Identifier zn = new Identifier("z" + ++mN);
      mExpr = new Sum(mExpr.substitute(Y, zn).substitute(X, Y), zn, Y, X_PLUS_Y);
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

