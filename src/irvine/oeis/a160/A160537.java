package irvine.oeis.a160;

import irvine.math.expression.Cosine;
import irvine.math.expression.Expression;
import irvine.math.expression.Identifier;
import irvine.math.expression.LiteralZ;
import irvine.math.expression.Power;
import irvine.math.expression.Sine;
import irvine.math.expression.Sircon;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A160537 a(n) = n!*c(n) where c(n) is the coefficient of the Taylor power series expansion of the real function sin(x)^cos(x) defined on (0,Pi), expanded around the point x = Pi/2.
 * @author Sean A. Irvine
 */
public class A160537 extends Sequence0 {

  // This is hideously slow

  private static final Identifier X = new Identifier("x");
  private int mN = -1;
  private Expression mDiff = new Power(new Sine(X), new Cosine(X));

  @Override
  public Z next() {
    if (++mN > 0) {
      mDiff = mDiff.diff(X).eval(); // this does symbolic differentiation
    }
    // Only the first two replacements are essential
    final String s = mDiff.toString().replace("sin(x)", "1").replace("cos(x)", "0").replace("log(1)", "0");
    //System.out.println(s);
    final Expression e = Sircon.parse(s);
    //return SeriesParser.parse(e.toString()).coeff(0).toZ(); // Alternative way to parse s
    return ((LiteralZ) e.eval()).value();
  }
}
