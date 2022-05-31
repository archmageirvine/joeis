package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061882 a(n) = Smallest nontrivial number k &gt; 9 such that first (leftmost) digit - second digit + third digit - fourth digit ... of k = n.
 * @author Georg Fischer
 */
public class A061882 extends A061870 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 9;
    while (true) {
      ++k;
      if (alternatingDigitSum(String.valueOf(k)) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
