package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083323 a(n) = 3^n - 2^n + 1.
 * @author Sean A. Irvine
 */
public class A083323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083323() {
    super(new long[] {6, -11, 6}, new long[] {1, 2, 6});
  }
}
