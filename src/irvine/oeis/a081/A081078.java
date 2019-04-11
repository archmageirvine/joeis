package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081078 Lucas(4n) <code>- 3,</code> or Lucas(2n-1)*Lucas(2n+1).
 * @author Sean A. Irvine
 */
public class A081078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081078() {
    super(new long[] {1, -8, 8}, new long[] {4, 44, 319});
  }
}
