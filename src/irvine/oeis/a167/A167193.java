package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167193 a(n) = (1/3)*(1 - (-2)^n + 3*(-1)^n ) = (-1)^(n+1)*A167030(n).
 * @author Sean A. Irvine
 */
public class A167193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167193() {
    super(new long[] {2, 1, -2}, new long[] {1, 0, 0});
  }
}
