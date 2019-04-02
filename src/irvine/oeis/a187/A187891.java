package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187891 a(0)=0, a(1)=5, a(n)=a(n-1)+a(n-2)-1.
 * @author Sean A. Irvine
 */
public class A187891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187891() {
    super(new long[] {-1, 0, 2}, new long[] {0, 5, 4});
  }
}
