package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251793.
 * @author Sean A. Irvine
 */
public class A251793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251793() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {0, 2, 68, 286, 6760});
  }
}
