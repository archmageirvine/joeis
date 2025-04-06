package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a075.A075786;

/**
 * A076443 Even-digit palindromic perfect powers.
 * @author Sean A. Irvine
 */
public class A076443 extends FilterSequence {

  /** Construct the sequence. */
  public A076443() {
    super(new A075786(), k -> (Functions.DIGIT_LENGTH.i(k) & 1) == 0);
  }
}
