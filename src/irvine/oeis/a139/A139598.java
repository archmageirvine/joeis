package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139598 <code>A035008(n)</code> followed by <code>A139098(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A139598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139598() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 8, 16, 32});
  }
}
