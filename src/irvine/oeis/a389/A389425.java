package irvine.oeis.a389;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a199.A199716;

/**
 * A389425 First differences of A199716.
 * @author Sean A. Irvine
 */
public class A389425 extends DifferenceSequence {

  /** Construct the sequence. */
  public A389425() {
    super(1, new A199716());
  }
}
