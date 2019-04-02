package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242762 a(n) = -a(n-1) + a(n-3) + 5*(n-2) for n&gt;2, a(0)=2, a(1)=3, a(2)=4.
 * @author Sean A. Irvine
 */
public class A242762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242762() {
    super(new long[] {1, -2, 0, 1, 1}, new long[] {2, 3, 4, 8, 10});
  }
}
