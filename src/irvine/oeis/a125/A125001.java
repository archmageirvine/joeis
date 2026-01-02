package irvine.oeis.a125;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A125001 Non-insertable primes: primes with property that no matter where you insert (or prepend or append) a digit you get a composite number (except for prepending a zero).
 * @author Sean A. Irvine
 */
public class A125001 extends FilterSequence {

  /**
   * Test if a number is a noninsertable prime.
   * @param n number to test
   * @return true if every insertion possible results in a composite number
   */
  public static boolean isNoninsertablePrime(final Z n) {
    final Z t = n.multiply(10);
    if (t.add(1).isProbablePrime()) {
      return false;
    }
    if (t.add(3).isProbablePrime()) {
      return false;
    }
    if (t.add(7).isProbablePrime()) {
      return false;
    }
    if (t.add(9).isProbablePrime()) {
      return false;
    }
    final String s = n.toString();
    for (int k = 0; k < s.length(); ++k) {
      final String left = s.substring(0, k);
      final String right = s.substring(k);
      for (int d = k == 0 ? 1 : 0; d < 10; ++d) {
        if (new Z(left + d + right).isProbablePrime()) {
          return false;
        }
      }
    }
    return true;
  }

  /** Construct the sequence. */
  public A125001() {
    super(1, new A000040(), A125001::isNoninsertablePrime);
  }
}
