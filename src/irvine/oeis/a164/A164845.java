package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164845.
 * @author Sean A. Irvine
 */
public class A164845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164845() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 11, 27, 54});
  }
}
