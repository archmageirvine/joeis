package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017502 <code>a(n) = (11*n + 9)^6</code>.
 * @author Sean A. Irvine
 */
public class A017502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017502() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {531441, 64000000, 887503681, 5489031744L, 22164361129L, 68719476736L, 177978515625L});
  }
}
