package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140724 Period 10: <code>1, 5, 9, 7, 7, 9, 5, 1, 3, 3</code> repeated.
 * @author Sean A. Irvine
 */
public class A140724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140724() {
    super(new long[] {1, -2, 2, -2, 2}, new long[] {1, 5, 9, 7, 7});
  }
}
