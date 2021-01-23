package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180964 a(0)=1; for n&gt;0, a(n)=1+3*A117571(n-1).
 * @author Sean A. Irvine
 */
public class A180964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180964() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 4, 4, 10});
  }
}
