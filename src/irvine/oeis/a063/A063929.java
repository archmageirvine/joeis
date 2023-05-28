package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063929 Radius of A-excircle of Pythagorean triangle with a = (n+1)^2 - m^2, b = 2*(n+1)*m and c = (n+1)^2 + m^2.
 * @author Sean A. Irvine
 */
public class A063929 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN + 1).multiply(mN - mM + 1);
  }
}
