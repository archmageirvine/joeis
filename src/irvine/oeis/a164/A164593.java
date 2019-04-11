package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164593 <code>a(n) = ((5 + sqrt(18))*(2 + sqrt(8))^n + (5 - sqrt(18))*(2 - sqrt(8))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A164593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164593() {
    super(new long[] {4, 4}, new long[] {5, 22});
  }
}
