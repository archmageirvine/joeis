package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290903 p-INVERT of the positive integers, where p(S) <code>= 1 -</code> 5*S.
 * @author Sean A. Irvine
 */
public class A290903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290903() {
    super(new long[] {-1, 7}, new long[] {5, 35});
  }
}
