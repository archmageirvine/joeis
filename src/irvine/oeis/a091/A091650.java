package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091650.
 * @author Sean A. Irvine
 */
public class A091650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091650() {
    super(new long[] {-1, -1, 3, 2}, new long[] {1, 3, 7, 21});
  }
}
