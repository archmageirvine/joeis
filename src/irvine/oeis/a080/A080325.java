package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080325 a(n) = ((n+1)!*(2*n+1)!/4) * [x^(2*n-2)] 1/sin(x)^2.
 * @author Sean A. Irvine
 */
public class A080325 extends Sequence0 {

  private final Series<Q> mS = SeriesParser.parse("1/(sin(x))^2");
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN < 1 ? Z.ZERO : mS.coeff(2 * mN - 2).multiply(Functions.FACTORIAL.z(mN + 1)).multiply(Functions.FACTORIAL.z(2 * mN + 1)).divide(4).toZ();
  }
}

