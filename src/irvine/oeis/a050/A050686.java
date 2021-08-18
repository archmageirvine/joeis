package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050686 Number of palindromes of length n and containing the digit 1 (or any other fixed nonzero digit).
 * @author Sean A. Irvine
 */
public class A050686 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    final int k = ++mN / 2;
    return k <= 1 ? Z.ONE : Z.TEN.pow(k - 1).multiply(9).subtract(Z.NINE.pow(k)).add(Z.NINE.pow(k - 1));
  }
}
