package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111566 a(n) = ((1+sqrt(8))*(2+sqrt(2))^n + (1-sqrt(8))*(2-sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A111566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111566() {
    super(new long[] {-2, 4}, new long[] {1, 6});
  }
}
