package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048575 Pisot sequences L(2,5), E(2,5).
 * @author Sean A. Irvine
 */
public class A048575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048575() {
    super(new long[] {-1, 3}, new long[] {2, 5});
  }
}
