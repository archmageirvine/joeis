package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087298 Exponent of 2 in factorization of (3n)!.
 * @author Sean A. Irvine
 */
public class A087298 extends Sequence1 {

  private long mN = 0;
  private long mF = 1;
  private long mCount = 0;

  @Override
  public Z next() {
    mF *= ++mN;
    mF *= ++mN;
    mF *= ++mN;
    while ((mF & 1) == 0) {
      ++mCount;
      mF >>>= 1;
    }
    return Z.valueOf(mCount);
  }
}
