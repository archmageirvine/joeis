package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a026.A026820;

/**
 * A058400 Triangle of partial row sums of partition triangle A058398.
 * @author Sean A. Irvine
 */
public class A058400 extends A026820 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mN + 1 - mM);
  }
}
