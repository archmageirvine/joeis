package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275543 <code>A081585</code> and <code>A069129</code> interleaved.
 * @author Sean A. Irvine
 */
public class A275543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275543() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 1, 9, 17});
  }
}
