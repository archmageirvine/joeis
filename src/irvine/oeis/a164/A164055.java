package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164055.
 * @author Sean A. Irvine
 */
public class A164055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164055() {
    super(new long[] {1, -35, 35}, new long[] {1, 10, 325});
  }
}
