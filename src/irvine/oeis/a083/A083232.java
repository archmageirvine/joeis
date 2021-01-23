package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083232 a(n) = (3*7^n+(-1)^n)/4.
 * @author Sean A. Irvine
 */
public class A083232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083232() {
    super(new long[] {7, 6}, new long[] {1, 5});
  }
}
