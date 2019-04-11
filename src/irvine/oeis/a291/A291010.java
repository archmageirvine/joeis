package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291010 p-INVERT of <code>(1,1,1,1,1,</code>...), where p(S) <code>= (1 - 2</code> S)(1 <code>- 3</code> S).
 * @author Sean A. Irvine
 */
public class A291010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291010() {
    super(new long[] {-12, 7}, new long[] {5, 24});
  }
}
