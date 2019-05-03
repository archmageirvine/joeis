package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253689 Centered triangular numbers <code>(A005448)</code> which are also centered heptagonal numbers <code>(A069099)</code>.
 * @author Sean A. Irvine
 */
public class A253689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253689() {
    super(new long[] {1, -1, -12098, 12098, 1}, new long[] {1, 316, 7246, 3818431, 87657571});
  }
}
