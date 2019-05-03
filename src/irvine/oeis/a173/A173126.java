package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173126 <code>sum_{k=floor[(n+5)/2] mod 5} C(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A173126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173126() {
    super(new long[] {2, -1, -6, 3, 2}, new long[] {0, 0, 0, 0, 1});
  }
}
