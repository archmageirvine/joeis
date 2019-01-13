package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266806.
 * @author Sean A. Irvine
 */
public class A266806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266806() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {-13, 143, 527, 4859, 30119});
  }
}
