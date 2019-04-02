package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163412 a(n) = 12*a(n-1) - 34*a(n-2) for n&gt;1, a(0)=1, a(1)=10.
 * @author Sean A. Irvine
 */
public class A163412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163412() {
    super(new long[] {-34, 12}, new long[] {1, 10});
  }
}
