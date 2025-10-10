package irvine.oeis.a389;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a199.A199716;

/**
 * A389425 allocated for Aied Sulaiman.
 * @author Sean A. Irvine
 */
public class A389425 extends DifferenceSequence {

  /** Construct the sequence. */
  public A389425() {
    super(1, new A199716());
  }
}
