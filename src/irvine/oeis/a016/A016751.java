package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016751 a(n) = (2*n)^11.
 * @author Sean A. Irvine
 */
public class A016751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016751() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {0, 2048, 4194304, 362797056, 8589934592L, 100000000000L, 743008370688L, 4049565169664L, 17592186044416L, 64268410079232L, 204800000000000L, 584318301411328L});
  }
}
