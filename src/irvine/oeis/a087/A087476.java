package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087476 Triangle read by rows where the n-th row has n terms: T(n,i)=(i+2)^2-4 mod n.
 * @author Sean A. Irvine
 */
public class A087476 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mM + 2).square().subtract(4).modZ(mN);
  }
}
