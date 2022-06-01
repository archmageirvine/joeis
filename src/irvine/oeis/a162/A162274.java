package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162274 a(n) = ((2+sqrt(3))*(4+sqrt(3))^n + (2-sqrt(3))*(4-sqrt(3))^n)/2.
 * @author Sean A. Irvine
 */
public class A162274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162274() {
    super(new long[] {-13, 8}, new long[] {2, 11});
  }
}
