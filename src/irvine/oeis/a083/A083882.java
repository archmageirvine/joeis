package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083882 a(0)=1, a(1)=4, a(n)=8a(n-1)-13a(n-2), n&gt;=2.
 * @author Sean A. Irvine
 */
public class A083882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083882() {
    super(new long[] {-13, 8}, new long[] {1, 4});
  }
}
