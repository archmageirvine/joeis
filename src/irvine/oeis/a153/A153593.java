package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153593 a(n) = ((9 + sqrt(2))^n - (9 - sqrt(2))^n)/(2*sqrt(2)).
 * @author Sean A. Irvine
 */
public class A153593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153593() {
    super(1, new long[] {-79, 18}, new long[] {1, 18});
  }
}
