package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050720 Number of nonzero palindromes of length n containing the digit '0'.
 * @author Sean A. Irvine
 */
public class A050720 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    final int k = ++mN / 2;
    return k <= 1 ? Z.ZERO : Z.TEN.pow(k - 1).multiply(9).subtract(Z.NINE.pow(k));
  }
}
