package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017430.
 * @author Sean A. Irvine
 */
public class A017430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017430() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {729, 7529536, 244140625, 2176782336L, 10779215329L, 38068692544L, 107918163081L});
  }
}
