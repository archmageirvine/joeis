package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106466 Interleave <code>1,2,3,</code>.. with <code>1,1,2,2,3,3,</code>...
 * @author Sean A. Irvine
 */
public class A106466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106466() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 1, 2, 1, 3, 2});
  }
}
