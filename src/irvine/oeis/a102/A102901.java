package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102901 a(n) = a(n-1) + 6*a(n-2), a(0)=1, a(1)=0.
 * @author Sean A. Irvine
 */
public class A102901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102901() {
    super(new long[] {6, 1}, new long[] {1, 0});
  }
}
