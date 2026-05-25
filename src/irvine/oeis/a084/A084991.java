package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A084991 Palindromes which can be written as a sum of two prime numbers.
 * @author Sean A. Irvine
 */
public class A084991 extends FilterSequence {

  /** Construct the sequence. */
  public A084991() {
    super(1, new A002113(), k -> {
      if (k.compareTo(Z.FOUR) < 0) {
        return false;
      }
      if (k.isEven()) {
        return true; // assume Goldbach
      }
      return k.subtract(2).isProbablePrime();
    });
  }
}
