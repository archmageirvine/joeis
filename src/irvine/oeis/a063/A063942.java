package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063942 Follow k with <code>k-1</code> and <code>k-2</code>.
 * @author Sean A. Irvine
 */
public class A063942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063942() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 0, -1, 2});
  }
}
