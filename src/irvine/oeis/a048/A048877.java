package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048877 <code>a(n) = 4*a(n-1) + a(n-2); a(0)=1, a(1)=8</code>.
 * @author Sean A. Irvine
 */
public class A048877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048877() {
    super(new long[] {1, 4}, new long[] {1, 8});
  }
}
