package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017154.
 * @author Sean A. Irvine
 */
public class A017154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017154() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {117649, 11390625, 148035889, 887503681, 3518743761L, 10779215329L, 27680640625L});
  }
}
