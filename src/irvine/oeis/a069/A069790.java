package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A069790 Triangular numbers with arithmetic mean of digits = 1 (sum of digits = number of digits).
 * @author Sean A. Irvine
 */
public class A069790 extends FilterSequence {

  /** Construct the sequence. */
  public A069790() {
    super(1, new A000217(), k -> Functions.DIGIT_SUM.l(k) == Functions.DIGIT_LENGTH.l(k));
  }
}

