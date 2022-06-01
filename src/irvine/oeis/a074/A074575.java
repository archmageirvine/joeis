package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074575 a(n) = 5^n + 7^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074575() {
    super(new long[] {315, -143, 21}, new long[] {3, 21, 155});
  }
}
