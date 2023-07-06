package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a002.A002026;

/**
 * A026107 Second differences of Motzkin numbers (A001006).
 * @author Sean A. Irvine
 */
public class A026107 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026107() {
    super(2, new A002026().skip(1));
  }
}
