package irvine.oeis.a075;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a032.A032350;

/**
 * A075801 Differences between adjacent palindromic nonprime numbers A032350.
 * @author Sean A. Irvine
 */
public class A075801 extends DifferenceSequence {

  /** Construct the sequence. */
  public A075801() {
    super(1, new A032350());
  }
}
