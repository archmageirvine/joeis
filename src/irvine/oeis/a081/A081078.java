package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081078 <code>Lucas(4n) - 3,</code> or <code>Lucas(2n-1)*Lucas(2n+1)</code>.
 * @author Sean A. Irvine
 */
public class A081078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081078() {
    super(new long[] {1, -8, 8}, new long[] {4, 44, 319});
  }
}
