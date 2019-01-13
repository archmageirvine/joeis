package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131355.
 * @author Sean A. Irvine
 */
public class A131355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131355() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 1, 1, 3, 4});
  }
}
