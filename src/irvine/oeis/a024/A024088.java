package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024088 <code>a(n) = 8^n-1</code>.
 * @author Sean A. Irvine
 */
public class A024088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024088() {
    super(new long[] {-8, 9}, new long[] {0, 7});
  }
}
