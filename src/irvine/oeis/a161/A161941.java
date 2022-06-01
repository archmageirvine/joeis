package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161941 a(n) = ((4+sqrt(2))*(2+sqrt(2))^n + (4-sqrt(2))*(2-sqrt(2))^n)/4.
 * @author Sean A. Irvine
 */
public class A161941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161941() {
    super(new long[] {-2, 4}, new long[] {2, 5});
  }
}
