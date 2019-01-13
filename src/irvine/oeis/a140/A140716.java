package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140716.
 * @author Sean A. Irvine
 */
public class A140716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140716() {
    super(new long[] {-1, 1, 1}, new long[] {7, 25, 31});
  }
}
