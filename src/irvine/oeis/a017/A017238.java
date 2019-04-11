package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017238 <code>a(n) = (9*n + 6)^6</code>.
 * @author Sean A. Irvine
 */
public class A017238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017238() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {46656, 11390625, 191102976, 1291467969, 5489031744L, 17596287801L, 46656000000L});
  }
}
