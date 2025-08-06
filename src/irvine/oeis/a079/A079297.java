package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079297 Triangle read by rows: the k-th column is an arithmetic progression with difference 2k-1 and the top entry is the hexagonal number k*(2*k-1) (A000384).
 * @author Sean A. Irvine
 */
public class A079297 extends Sequence1 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN).multiply(2 * mM - 1);
  }
}
