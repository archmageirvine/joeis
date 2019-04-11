package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048481 <code>a(n) =</code> T(0,n)+T(1,n-1)+...+T(n,0), array T given by A048472.
 * @author Sean A. Irvine
 */
public class A048481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048481() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 3, 9, 27});
  }
}
