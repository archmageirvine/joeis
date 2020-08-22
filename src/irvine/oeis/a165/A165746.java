package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165746 a(n) = 3 - 2*3^n.
 * @author Sean A. Irvine
 */
public class A165746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165746() {
    super(new long[] {-3, 4}, new long[] {1, -3});
  }
}
