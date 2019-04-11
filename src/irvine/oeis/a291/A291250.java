package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291250 p-INVERT of <code>(0,1,0,1,0,1,</code>...), where p(S) <code>= 1 -</code> S <code>- 2</code> S^2 <code>+ 2</code> S^3.
 * @author Sean A. Irvine
 */
public class A291250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291250() {
    super(new long[] {1, 1, -5, -4, 5, 1}, new long[] {1, 3, 4, 13, 17, 52});
  }
}
