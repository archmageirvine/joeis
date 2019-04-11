package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023039 <code>a(n) = 18*a(n-1) - a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A023039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023039() {
    super(new long[] {-1, 18}, new long[] {1, 9});
  }
}
