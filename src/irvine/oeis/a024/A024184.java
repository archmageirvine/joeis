package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024184 Third elementary symmetric function of 3,4,...,n+4.
 * @author Sean A. Irvine
 */
public class A024184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024184() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {60, 342, 1175, 3135, 7140, 14560, 27342});
  }
}
