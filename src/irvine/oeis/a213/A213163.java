package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213163 Sequence of coefficients of x in marked mesh pattern generating function Q_{n,132}^(3,0,-,0)(x).
 * @author Sean A. Irvine
 */
public class A213163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213163() {
    super(new long[] {1, -7, 17, -17, 7}, new long[] {1, 7, 32, 122, 422});
  }
}
