package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013942 Triangle of numbers T(n,k) = floor(2n/k), k=1..2n, read by rows.
 * @author Sean A. Irvine
 */
public class A013942 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mN += 2;
      mM = 1;
    }
    return Z.valueOf(mN / mM);
  }
}
