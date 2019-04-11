package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210677 <code>a(n)=a(n-1)+a(n-2)+n+1, a(0)=a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A210677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210677() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 1, 5, 10});
  }
}
