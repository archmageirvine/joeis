package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152265 <code>a(n) = ((8+sqrt(7))^n + (8-sqrt(7))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A152265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152265() {
    super(new long[] {-57, 16}, new long[] {1, 8});
  }
}
