package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238420 a(n)=the Wiener index of the Lucas cube L_n.
 * @author Sean A. Irvine
 */
public class A238420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238420() {
    super(new long[] {-1, 4, 0, -10, 0, 4}, new long[] {0, 4, 9, 40, 120, 390});
  }
}
