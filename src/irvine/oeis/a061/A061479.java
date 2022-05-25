package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061479 Smallest number m such that first digit - second digit + third digit - fourth digit ... (of m) = n.
 * @author Georg Fischer
 */
public class A061479 extends A061870 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = -1;
    while (true) {
      ++k;
      if (alternatingDigitSum(String.valueOf(k)) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
