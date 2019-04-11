package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099393 <code>a(n) = 4^n + 2^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A099393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099393() {
    super(new long[] {8, -14, 7}, new long[] {1, 5, 19});
  }
}
