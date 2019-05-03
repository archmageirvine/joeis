package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036546 <code>a(n) = T(5,n)</code>, array T given by <code>A048471</code>.
 * @author Sean A. Irvine
 */
public class A036546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036546() {
    super(new long[] {-3, 4}, new long[] {1, 33});
  }
}
