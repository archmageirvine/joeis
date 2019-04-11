package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074541 <code>a(n) = 2^n + 6^n + 7^n</code>.
 * @author Sean A. Irvine
 */
public class A074541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074541() {
    super(new long[] {84, -68, 15}, new long[] {3, 15, 89});
  }
}
