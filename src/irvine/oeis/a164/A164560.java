package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164560.
 * @author Sean A. Irvine
 */
public class A164560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164560() {
    super(new long[] {-6, 6, 1}, new long[] {1, 5, 11});
  }
}
