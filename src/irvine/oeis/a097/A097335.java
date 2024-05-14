package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097335 a(n) = Sum_{k=0..n} C(n-k, floor(k/2))*3^k.
 * @author Sean A. Irvine
 */
public class A097335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097335() {
    super(new long[] {9, 0, 1}, new long[] {1, 4, 4});
  }
}
