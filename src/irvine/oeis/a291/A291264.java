package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291264 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where p(S) <code>= (1 - 2</code> S)^2.
 * @author Sean A. Irvine
 */
public class A291264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291264() {
    super(new long[] {-1, -4, -2, 4}, new long[] {4, 12, 36, 104});
  }
}
