package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275155 a(1) = 18; a(n) = 3*a(n - 1) + 2*sqrt(2*a(n - 1)*(a(n - 1) - 14)) - 14 for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A275155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275155() {
    super(new long[] {1, -7, 7}, new long[] {18, 64, 338});
  }
}
