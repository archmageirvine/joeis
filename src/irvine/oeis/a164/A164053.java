package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164053.
 * @author Sean A. Irvine
 */
public class A164053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164053() {
    super(new long[] {-2, 2, 1}, new long[] {3, 5, 11});
  }
}
