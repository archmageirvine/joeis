package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164606.
 * @author Sean A. Irvine
 */
public class A164606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164606() {
    super(new long[] {-17, 10}, new long[] {1, 21});
  }
}
