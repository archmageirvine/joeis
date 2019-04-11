package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152264 <code>a(n) = ((9+sqrt(6))^n + (9-sqrt(6))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A152264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152264() {
    super(new long[] {-75, 18}, new long[] {1, 9});
  }
}
