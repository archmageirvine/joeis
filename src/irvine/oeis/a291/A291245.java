package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291245 p-INVERT of <code>(0,1,0,1,0,1,</code>...), where p(S) <code>= 1 - 5</code> S + S^2.
 * @author Sean A. Irvine
 */
public class A291245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291245() {
    super(new long[] {-1, -5, 1, 5}, new long[] {5, 24, 120, 599});
  }
}
