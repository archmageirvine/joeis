package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081069 a(n) = Lucas(4n)+2 = Lucas(2n)^2.
 * @author Sean A. Irvine
 */
public class A081069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081069() {
    super(new long[] {1, -8, 8}, new long[] {4, 9, 49});
  }
}
