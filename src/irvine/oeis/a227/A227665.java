package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227665 Number of lattice paths from <code>{n}^3</code> to <code>{0}^3</code> using steps that decrement one component by 1 such that for each point <code>(p_1,p_2,p_3)</code> we have <code>abs(p_{i}-p_{i+1}) &lt;= 1</code>.
 * @author Sean A. Irvine
 */
public class A227665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227665() {
    super(new long[] {2, 7}, new long[] {1, 6});
  }
}
