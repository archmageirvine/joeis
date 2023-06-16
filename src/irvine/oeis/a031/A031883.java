package irvine.oeis.a031;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000959;

/**
 * A031883 First differences of lucky numbers.
 * @author Sean A. Irvine
 */
public class A031883 extends DifferenceSequence {

  /** Construct the sequence. */
  public A031883() {
    super(1, new A000959());
  }
}
