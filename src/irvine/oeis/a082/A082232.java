package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A082232 Palindromes divisible by their digit sum.
 * @author Sean A. Irvine
 */
public class A082232 extends FilterSequence {

  /** Construct the sequence. */
  public A082232() {
    super(1, new A002113().skip(), k -> k.mod(Functions.DIGIT_SUM.l(k)) == 0);
  }
}
