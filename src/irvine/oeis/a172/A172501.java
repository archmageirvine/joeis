package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172501 <code>a(n) =</code> binomial(n+8,8)*6^n.
 * @author Sean A. Irvine
 */
public class A172501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172501() {
    super(new long[] {10077696, -15116544, 10077696, -3919104, 979776, -163296, 18144, -1296, 54}, new long[] {1, 54, 1620, 35640, 641520, 10007712, 140107968, 1801388160, 21616657920L});
  }
}
