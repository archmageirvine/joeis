package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128799 a(n) = n*(n-1)*5^n.
 * @author Sean A. Irvine
 */
public class A128799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128799() {
    super(new long[] {125, -75, 15}, new long[] {0, 0, 50});
  }
}
