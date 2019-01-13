package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164408.
 * @author Sean A. Irvine
 */
public class A164408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164408() {
    super(new long[] {-1, 1, 1, 1}, new long[] {13, 23, 40, 68});
  }
}
