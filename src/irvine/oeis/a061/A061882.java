package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061882 Smallest nontrivial number m such that first (leftmost) digit - second digit + third digit - fourth digit ... = n.
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
