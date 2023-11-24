package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066879 n such that there are as many 1's as 0's in the base 2 expansion of Floor(n/2).
 * @author Sean A. Irvine
 */
public class A066879 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final long t = ++mN / 2;
      if (2 * Long.bitCount(t) == Long.SIZE - Long.numberOfLeadingZeros(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
