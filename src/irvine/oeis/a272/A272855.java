package irvine.oeis.a272;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A272855 Ramanujan&apos;s gamma-series.
 * @author Georg Fischer
 */
public class A272855 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A272855() {
    // a(n) = 82*a(n-1)+82*a(n-2)-a(n-3)
    super(0, "[[0],[-1],[82],[82],[-1]]", "12,1010,83802", 0);
  }
}
