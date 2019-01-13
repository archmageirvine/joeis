package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164592.
 * @author Sean A. Irvine
 */
public class A164592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164592() {
    super(new long[] {-17, 10}, new long[] {1, 8});
  }
}
