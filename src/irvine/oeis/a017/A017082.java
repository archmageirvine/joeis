package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017082.
 * @author Sean A. Irvine
 */
public class A017082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017082() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 531441, 24137569, 244140625, 1291467969, 4750104241L, 13841287201L});
  }
}
