package irvine.oeis.a011;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000110;

/**
 * A011965.
 * @author Sean A. Irvine
 */
public class A011965 extends DifferenceSequence {

  /** Construct the sequence. */
  public A011965() {
    super(new DifferenceSequence(new A000110()));
  }
}

