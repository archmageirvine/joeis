package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195321 <code>a(n) = 18*n^2</code>.
 * @author Sean A. Irvine
 */
public class A195321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195321() {
    super(new long[] {1, -3, 3}, new long[] {0, 18, 72});
  }
}
