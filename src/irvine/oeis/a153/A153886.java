package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153886 a(n) = ((9 + sqrt(5))^n - (9 - sqrt(5))^n)/(2*sqrt(5)).
 * @author Sean A. Irvine
 */
public class A153886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153886() {
    super(new long[] {-76, 18}, new long[] {1, 18});
  }
}
