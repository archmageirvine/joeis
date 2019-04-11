package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157803 <code>8984250*n - 8464830</code>.
 * @author Sean A. Irvine
 */
public class A157803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157803() {
    super(new long[] {-1, 2}, new long[] {519420, 9503670});
  }
}
