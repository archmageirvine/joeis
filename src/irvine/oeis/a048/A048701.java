package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048701 List of binary palindromes of even length (written in base 10).
 * @author Sean A. Irvine
 */
public class A048701 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    return new Z(s + new StringBuilder(s).reverse(), 2);
  }
}
