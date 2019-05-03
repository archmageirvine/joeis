package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048477 <code>a(n) = T(5,n)</code>, array T given by <code>A048472</code>.
 * @author Sean A. Irvine
 */
public class A048477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048477() {
    super(new long[] {4, -8, 5}, new long[] {1, 7, 25});
  }
}
