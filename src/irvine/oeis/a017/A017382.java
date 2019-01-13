package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017382.
 * @author Sean A. Irvine
 */
public class A017382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017382() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {531441, 47045881, 594823321, 3518743761L, 13841287201L, 42180533641L, 107918163081L});
  }
}
