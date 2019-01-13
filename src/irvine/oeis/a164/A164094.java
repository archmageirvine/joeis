package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164094.
 * @author Sean A. Irvine
 */
public class A164094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164094() {
    super(new long[] {-2, 3}, new long[] {5, 8});
  }
}
