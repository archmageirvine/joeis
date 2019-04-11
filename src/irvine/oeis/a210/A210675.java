package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210675 <code>a(n)=a(n-1)+a(n-2)+n+4, a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A210675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210675() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 1, 7, 15});
  }
}
