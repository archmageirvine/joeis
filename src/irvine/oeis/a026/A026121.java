package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026121 <code>a(n) = 3^n*(3^n-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A026121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026121() {
    super(new long[] {-27, 12}, new long[] {0, 3});
  }
}
