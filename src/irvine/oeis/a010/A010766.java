package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010766 Triangle read by rows: row n gives the numbers floor(n/k), k=1..n.
 * @author Sean A. Irvine
 */
public class A010766 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN / mM);
  }
}
