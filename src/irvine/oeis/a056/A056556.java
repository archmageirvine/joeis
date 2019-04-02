package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056556 First tetrahedral co-ordinate; repeat m (m+1)*(m+2)/2 times.
 * @author Sean A. Irvine
 */
public class A056556 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      ++mN;
      mM = (mN + 1) * (mN + 2) / 2 - 1;
    }
    return Z.valueOf(mN);
  }
}
