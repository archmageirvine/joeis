package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165755 a(n) = (5-3*5^n)/2.
 * @author Sean A. Irvine
 */
public class A165755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165755() {
    super(new long[] {-5, 6}, new long[] {1, -5});
  }
}
