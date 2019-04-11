package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172510 <code>a(n) =</code> binomial(n <code>+ 4, 4) * 8^n</code>.
 * @author Sean A. Irvine
 */
public class A172510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172510() {
    super(new long[] {32768, -20480, 5120, -640, 40}, new long[] {1, 40, 960, 17920, 286720});
  }
}
