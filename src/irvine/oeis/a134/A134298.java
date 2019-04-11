package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134298 <code>a(n) = (107n)^5</code>.
 * @author Sean A. Irvine
 */
public class A134298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134298() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {14025517307L, 448816553824L, 3408200705601L, 14362129722368L, 43829741584375L, 109062422579232L});
  }
}
