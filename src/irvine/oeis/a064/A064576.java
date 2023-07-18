package irvine.oeis.a064;

import irvine.oeis.DifferenceSequence;

/**
 * A064576 First differences of A064573.
 * @author Sean A. Irvine
 */
public class A064576 extends DifferenceSequence {

  /** Construct the sequence. */
  public A064576() {
    super(1, new A064573());
  }
}

