package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037968 Greatest number of distinct digits of n in any base b&gt;=2.
 * @author Sean A. Irvine
 */
public class A037968 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int bestCount = 1;
    for (int base = 2; base <= mN; ++base) {
      Z syndrome = Z.ZERO;
      int m = mN;
      while (m != 0) {
        syndrome = syndrome.setBit(m % base);
        m /= base;
      }
      if (syndrome.bitCount() > bestCount) {
        bestCount = syndrome.bitCount();
      }
    }
    return Z.valueOf(bestCount);
  }
}
