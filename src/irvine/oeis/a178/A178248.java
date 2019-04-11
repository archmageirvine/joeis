package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178248 <code>a(n) = 12^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A178248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178248() {
    super(new long[] {-12, 13}, new long[] {2, 13});
  }
}
