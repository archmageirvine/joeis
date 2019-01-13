package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131669.
 * @author Sean A. Irvine
 */
public class A131669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131669() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 5, 7, 9, 2, 4, 6, 8});
  }
}
