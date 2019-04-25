package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206810 <code>Sum_{0&lt;j&lt;n} (n^4-j^4)</code>.
 * @author Sean A. Irvine
 */
public class A206810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206810() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {15, 145, 670, 2146, 5501, 12131});
  }
}
