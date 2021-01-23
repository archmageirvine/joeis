package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037914 a(n) is the least base b&gt;=2 such that the number of distinct digits in the base b representation of n is maximized.
 * @author Sean A. Irvine
 */
public class A037914 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int best = 2;
    int bestCount = 0;
    for (int base = 2; base <= mN; ++base) {
      Z syndrome = Z.ZERO;
      int m = mN;
      while (m != 0) {
        syndrome = syndrome.setBit(m % base);
        m /= base;
      }
      if (syndrome.bitCount() > bestCount) {
        bestCount = syndrome.bitCount();
        best = base;
      }
    }
    return Z.valueOf(best);
  }
}
