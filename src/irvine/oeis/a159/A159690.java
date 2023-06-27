package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159690 Positive numbers y such that y^2 is of the form x^2+(x+881)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A159690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159690() {
    super(1, new long[] {-1, 0, 0, 6, 0, 0}, new long[] {841, 881, 925, 4121, 4405, 4709});
  }
}
