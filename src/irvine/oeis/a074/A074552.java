package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074552 <code>a(n) = 3^n + 5^n + 7^n</code>.
 * @author Sean A. Irvine
 */
public class A074552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074552() {
    super(new long[] {105, -71, 15}, new long[] {3, 15, 83});
  }
}
