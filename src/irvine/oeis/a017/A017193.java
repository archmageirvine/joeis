package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017193 <code>a(n) = (9*n + 2)^9</code>.
 * @author Sean A. Irvine
 */
public class A017193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017193() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {512, 2357947691L, 512000000000L, 14507145975869L, 165216101262848L, 1119130473102767L, 5416169448144896L, 20711912837890625L, 66540410775079424L, 186940255267540403L});
  }
}
