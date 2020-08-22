package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000245;

/**
 * A026012 Second differences of Catalan numbers A000108.
 * @author Sean A. Irvine
 */
public class A026012 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026012() {
    super(new A000245());
  }
}

