package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158272 <code>324n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158272() {
    super(new long[] {-1, 2}, new long[] {325, 649});
  }
}
