package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074048 Pentanacci numbers with initial conditions a(0)=5, a(1)=1, a(2)=3, a(3)=7, a(4)=15.
 * @author Sean A. Irvine
 */
public class A074048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074048() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {5, 1, 3, 7, 15});
  }
}
