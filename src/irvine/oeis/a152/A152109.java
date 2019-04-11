package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152109 <code>a(n) = ((8+sqrt(5))^n + (8-sqrt(5))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A152109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152109() {
    super(new long[] {-59, 16}, new long[] {1, 8});
  }
}
