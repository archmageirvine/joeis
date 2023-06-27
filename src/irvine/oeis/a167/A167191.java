package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167191 4*n*(1+45*n+620*n^2).
 * @author Sean A. Irvine
 */
public class A167191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167191() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {2664, 20568, 68592, 161616});
  }
}
