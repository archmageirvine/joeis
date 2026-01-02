package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;

/**
 * A082948 Palindromes neither divisible by any of their digits nor by the sum of their digits.
 * @author Sean A. Irvine
 */
public class A082948 extends FilterSequence {

  /** Construct the sequence. */
  public A082948() {
    super(1, new A082947(), k -> k.mod(Functions.DIGIT_SUM.l(k)) != 0);
  }
}
