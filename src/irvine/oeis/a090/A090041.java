package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090041.
 * @author Sean A. Irvine
 */
public class A090041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090041() {
    super(new long[] {-20, 10}, new long[] {1, 6});
  }
}
