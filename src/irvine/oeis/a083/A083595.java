package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083595 a(n) = (7*2^n - 4(-1)^n)/3.
 * @author Sean A. Irvine
 */
public class A083595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083595() {
    super(new long[] {2, 1}, new long[] {1, 6});
  }
}
