package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049681 <code>a(n) = (Lucas(2*n) - Lucas(n))/2</code>.
 * @author Sean A. Irvine
 */
public class A049681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049681() {
    super(new long[] {1, -2, -3, 4}, new long[] {0, 1, 2, 7});
  }
}
