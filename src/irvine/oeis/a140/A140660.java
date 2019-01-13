package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140660.
 * @author Sean A. Irvine
 */
public class A140660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140660() {
    super(new long[] {-4, 5}, new long[] {4, 13});
  }
}
