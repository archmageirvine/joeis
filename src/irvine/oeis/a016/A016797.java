package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016797.
 * @author Sean A. Irvine
 */
public class A016797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016797() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {512, 1953125, 134217728, 2357947691L, 20661046784L, 118587876497L, 512000000000L, 1801152661463L, 5429503678976L, 14507145975869L});
  }
}
