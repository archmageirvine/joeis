package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135449.
 * @author Sean A. Irvine
 */
public class A135449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135449() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 9, -7, 3, 5});
  }
}
