package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098525.
 * @author Sean A. Irvine
 */
public class A098525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098525() {
    super(new long[] {9, 0, 0, 0, 1}, new long[] {1, 1, 4, 4, 4});
  }
}
