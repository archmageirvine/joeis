package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164303.
 * @author Sean A. Irvine
 */
public class A164303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164303() {
    super(new long[] {1, 2}, new long[] {3, 11});
  }
}
