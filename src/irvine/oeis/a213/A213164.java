package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213164 Sequence of coefficients of x in marked mesh pattern generating function Q_{n,132}^(4,0,-,0)(x).
 * @author Sean A. Irvine
 */
public class A213164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213164() {
    super(5, new long[] {9, -33, 46, -30, 9}, new long[] {1, 9, 51, 235, 966});
  }
}
