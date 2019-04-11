package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093069 <code>a(n) = (2^n + 1)^2 - 2</code>.
 * @author Sean A. Irvine
 */
public class A093069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093069() {
    super(new long[] {8, -14, 7}, new long[] {7, 23, 79});
  }
}
