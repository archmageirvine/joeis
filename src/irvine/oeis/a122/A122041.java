package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122041 a(n) = 2*a(n-1) - 1 for n&gt;1, a(1)=23.
 * @author Sean A. Irvine
 */
public class A122041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122041() {
    super(new long[] {-2, 3}, new long[] {23, 45});
  }
}
