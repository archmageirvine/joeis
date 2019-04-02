package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051937 Truncated triangular pyramid numbers: a(n) = Sum_{k=4..n} k*(k+1)/2-9.
 * @author Sean A. Irvine
 */
public class A051937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051937() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 19, 38});
  }
}
