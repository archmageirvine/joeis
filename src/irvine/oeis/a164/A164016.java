package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164016.
 * @author Sean A. Irvine
 */
public class A164016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164016() {
    super(new long[] {1, -3, 3}, new long[] {6, 42, 114});
  }
}
