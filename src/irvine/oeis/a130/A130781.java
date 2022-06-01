package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130781 Sequence is identical to its third differences: a(n+3) = 3*a(n+2) - 3*a(n+1) + 2*a(n), with a(0)=a(1)=1, a(2)=2.
 * @author Sean A. Irvine
 */
public class A130781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130781() {
    super(new long[] {2, -3, 3}, new long[] {1, 1, 2});
  }
}
