package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083316 a(n) = (2*6^n - (5^n - 3^n))/2.
 * @author Sean A. Irvine
 */
public class A083316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083316() {
    super(new long[] {90, -63, 14}, new long[] {1, 5, 28});
  }
}
