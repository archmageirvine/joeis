package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048469 <code>a(n) = T(8,n),</code> array T given by A047858.
 * @author Sean A. Irvine
 */
public class A048469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048469() {
    super(new long[] {4, -8, 5}, new long[] {1, 10, 29});
  }
}
