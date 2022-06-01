package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017609 (12n+7)^5.
 * @author Sean A. Irvine
 */
public class A017609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017609() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {16807, 2476099, 28629151, 147008443, 503284375, 1350125107});
  }
}
