package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164588 a(n) = ((3 + sqrt(18))*(5 + sqrt(8))^n + (3 - sqrt(18))*(5 - sqrt(8))^n)/6.
 * @author Sean A. Irvine
 */
public class A164588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164588() {
    super(new long[] {-17, 10}, new long[] {1, 9});
  }
}
