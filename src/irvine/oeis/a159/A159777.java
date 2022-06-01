package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159777 Positive numbers y such that y^2 is of the form x^2+(x+167)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A159777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159777() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {145, 167, 197, 673, 835, 1037});
  }
}
