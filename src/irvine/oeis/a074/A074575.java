package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074575 <code>a(n) = 5^n + 7^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074575() {
    super(new long[] {315, -143, 21}, new long[] {3, 21, 155});
  }
}
