package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087275 Write n in binary: 1ab..yz, then a(n) = 1b..yz + ... + 1yz + 1z + 1.
 * @author Sean A. Irvine
 */
public class A087275 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 1 - mN;
    long m = 1;
    while (m < mN) {
      s += mN & m;
      s += m + 1;
      m <<= 1;
      m |= 1;
    }
    return Z.valueOf(s);
  }
}
