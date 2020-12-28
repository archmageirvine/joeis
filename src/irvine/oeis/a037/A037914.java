package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037914 a(n)=least base b&gt;=2 such that f(b,n)&gt;=f(b',n) for all b'&gt;=2, where f(b,n)=number of distinct base b digits of n.
 * @author Sean A. Irvine
 */
public class A037914 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int best = 2;
    int bestCount = 0;
    for (int base = 2; base < mN; ++base) {
      Z syndrome = Z.ZERO;
      int m = mN;
      while (m != 0) {
        syndrome = syndrome.setBit(m % base);
        m /= base;
      }
      //System.out.println(mN + " " + base + " " + syndrome.toString(2));
      if (syndrome.bitCount() > bestCount) {
        bestCount = syndrome.bitCount();
        best = base;
      }
    }
    return Z.valueOf(best);
  }
}
