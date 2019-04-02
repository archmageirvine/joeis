package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041215 Denominators of continued fraction convergents to sqrt(118).
 * @author Sean A. Irvine
 */
public class A041215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041215() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 613834, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 7, 22, 51, 532, 1115, 3877, 24377, 28254, 589457, 617711, 4295723, 13504880, 31305483, 326559710, 684424903, 2379834419L, 14963431417L, 17343265836L});
  }
}
