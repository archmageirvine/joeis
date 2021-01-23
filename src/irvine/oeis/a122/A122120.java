package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122120 a(n) = 4*a(n-1) + 9*a(n-2), for n&gt;1, with a(0)=1, a(1)=3.
 * @author Sean A. Irvine
 */
public class A122120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122120() {
    super(new long[] {9, 4}, new long[] {1, 3});
  }
}
