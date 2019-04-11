package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158628 <code>a(n) = 44*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158628() {
    super(new long[] {1, -3, 3}, new long[] {43, 175, 395});
  }
}
