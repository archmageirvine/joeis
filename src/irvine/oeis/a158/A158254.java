package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158254 <code>289n^2 + 2n</code>.
 * @author Sean A. Irvine
 */
public class A158254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158254() {
    super(new long[] {1, -3, 3}, new long[] {291, 1160, 2607});
  }
}
