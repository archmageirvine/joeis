package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117202 Binomial transform of <code>n*F(n)</code>.
 * @author Sean A. Irvine
 */
public class A117202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117202() {
    super(new long[] {-1, 6, -11, 6}, new long[] {0, 1, 4, 15});
  }
}
