package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131015.
 * @author Sean A. Irvine
 */
public class A131015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131015() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 2, 2, 1, 4, 4, 2, 3, 3, 4});
  }
}
