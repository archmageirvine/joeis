package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164608.
 * @author Sean A. Irvine
 */
public class A164608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164608() {
    super(new long[] {-8, 8}, new long[] {1, 12});
  }
}
