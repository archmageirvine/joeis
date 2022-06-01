package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164299 a(n) = ((1+4*sqrt(2))*(3+sqrt(2))^n + (1-4*sqrt(2))*(3-sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A164299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164299() {
    super(new long[] {-7, 6}, new long[] {1, 11});
  }
}
