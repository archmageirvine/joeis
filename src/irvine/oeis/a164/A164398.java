package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164398.
 * @author Sean A. Irvine
 */
public class A164398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164398() {
    super(new long[] {-1, 0, 0, 2}, new long[] {14, 25, 45, 82});
  }
}
