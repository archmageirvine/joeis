package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135440 a(n) = a(n-1) + 2a(n-2).
 * @author Sean A. Irvine
 */
public class A135440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135440() {
    super(new long[] {2, 1}, new long[] {-1, 4});
  }
}
