package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165897 <code>a(n) = a(n-1) +</code> largest proper divisor of <code>a(n-1), a(1)=4</code>.
 * @author Sean A. Irvine
 */
public class A165897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165897() {
    super(new long[] {3, 0, 0}, new long[] {4, 6, 9});
  }
}
