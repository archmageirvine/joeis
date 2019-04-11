package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158253 <code>289n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158253() {
    super(new long[] {-1, 2}, new long[] {288, 577});
  }
}
