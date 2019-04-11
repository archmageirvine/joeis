package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291016 p-INVERT of <code>(1,1,1,1,1,</code>...), where p(S) <code>= 1 - 4</code> S + S^2.
 * @author Sean A. Irvine
 */
public class A291016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291016() {
    super(new long[] {-6, 6}, new long[] {4, 19});
  }
}
