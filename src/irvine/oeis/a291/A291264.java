package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291264 p-INVERT of (0,1,0,1,0,1,...), where p(S) = (1 - 2 S)^2.
 * @author Sean A. Irvine
 */
public class A291264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291264() {
    super(new long[] {-1, -4, -2, 4}, new long[] {4, 12, 36, 104});
  }
}
