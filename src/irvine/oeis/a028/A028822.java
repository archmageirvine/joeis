package irvine.oeis.a028;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A028822 Squares with digits in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A028822 extends FilterSequence {

  /** Construct the sequence. */
  public A028822() {
    super(1, new A000290(), ZUtils::isNonincreasingDigits);
  }
}
