package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164588 <code>a(n) = ((3 + sqrt(18))*(5 + sqrt(8))^n + (3 - sqrt(18))*(5 - sqrt(8))^n)/6</code>.
 * @author Sean A. Irvine
 */
public class A164588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164588() {
    super(new long[] {-17, 10}, new long[] {1, 9});
  }
}
