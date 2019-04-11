package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017454 <code>a(n) = (11*n + 5)^6</code>.
 * @author Sean A. Irvine
 */
public class A017454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017454() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {15625, 16777216, 387420489, 3010936384L, 13841287201L, 46656000000L, 128100283921L});
  }
}
