package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117585 <code>a(n) = 2*(a(n-1))+ a(n-2) +</code> n.
 * @author Sean A. Irvine
 */
public class A117585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117585() {
    super(new long[] {1, 0, -4, 4}, new long[] {1, 3, 9, 24});
  }
}
