package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048703 Numbers which in base 4 are palindromes and have an even number of digits.
 * @author Sean A. Irvine
 */
public class A048703 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toString(++mN, 4);
    return new Z(s + new StringBuilder(s).reverse(), 4);
  }
}
