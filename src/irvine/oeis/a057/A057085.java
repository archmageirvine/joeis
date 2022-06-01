package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057085 a(n) = 9*a(n-1) - 9*a(n-2) for n&gt;1, with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A057085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057085() {
    super(new long[] {-9, 9}, new long[] {0, 1});
  }
}
