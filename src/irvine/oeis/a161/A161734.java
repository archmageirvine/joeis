package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161734 a(n) = ((2+sqrt(2))*(5+sqrt(2))^n+(2-sqrt(2))*(5-sqrt(2))^n)/4.
 * @author Sean A. Irvine
 */
public class A161734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161734() {
    super(new long[] {-23, 10}, new long[] {1, 6});
  }
}
