package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121740 Solutions to the Pell equation  x^2 - 17y^2 = 1 (y values).
 * @author Sean A. Irvine
 */
public class A121740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121740() {
    super(new long[] {-1, 66}, new long[] {0, 8});
  }
}
