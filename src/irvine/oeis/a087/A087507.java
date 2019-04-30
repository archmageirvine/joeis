package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087507 <code>#{0&lt;=k&lt;=n</code>: <code>k*n</code> is divisible by <code>3}</code>.
 * @author Sean A. Irvine
 */
public class A087507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087507() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 1, 1, 4, 2, 2});
  }
}
