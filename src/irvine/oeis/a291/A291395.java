package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291395 p-INVERT of <code>(1,1,0,0,0,0,</code>...), where p(S) <code>= (1 - 2</code> S)(1 <code>- 3</code> S).
 * @author Sean A. Irvine
 */
public class A291395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291395() {
    super(new long[] {-6, -12, -1, 5}, new long[] {5, 24, 103, 425});
  }
}
