package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159574.
 * @author Sean A. Irvine
 */
public class A159574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159574() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {313, 337, 365, 1513, 1685, 1877});
  }
}
