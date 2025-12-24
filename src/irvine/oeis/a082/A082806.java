package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002385;

/**
 * A082806 Palindromes which are prime and the sum of the digits is also prime.
 * @author Sean A. Irvine
 */
public class A082806 extends FilterSequence {

  /** Construct the sequence. */
  public A082806() {
    super(new A002385(), k -> Functions.DIGIT_SUM.z(k).isProbablePrime());
  }
}
