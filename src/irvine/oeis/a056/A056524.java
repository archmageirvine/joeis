package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056524 Palindromes with even number of digits.
 * @author Sean A. Irvine
 */
public class A056524 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    return new Z(s + new StringBuilder(s).reverse());
  }
}
