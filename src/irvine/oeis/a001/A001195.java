package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001195 a(n) = floor(n*log((14/11)*n^(10/9))).
 * @author Sean A. Irvine
 */
public class A001195 extends Sequence0 {

  private static final double LOG_CONST = Math.log(14) - Math.log(11);

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final double b = mN * (LOG_CONST + 10L * Math.log(mN) / 9);
    final double c = Math.floor(b);
    final double d = Math.abs(b - c);
    if (d < 0.0001 || d > 0.999) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf((long) c);
  }
}
