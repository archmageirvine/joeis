package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117614 a(0)=1, a(n)=4a(n-1)+2 for n odd, a(n)=4a(n-1) for n even.
 * @author Sean A. Irvine
 */
public class A117614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117614() {
    super(new long[] {-4, 1, 4}, new long[] {1, 6, 24});
  }
}
