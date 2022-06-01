package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122100 a(n) = 3*a(n-1) - a(n-3) for n&gt;2, with a(0)=1, a(1)=-1, a(2)=0.
 * @author Sean A. Irvine
 */
public class A122100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122100() {
    super(new long[] {-1, 0, 3}, new long[] {1, -1, 0});
  }
}
