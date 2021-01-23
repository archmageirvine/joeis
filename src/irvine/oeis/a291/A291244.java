package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291244 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - 4 S + S^2.
 * @author Sean A. Irvine
 */
public class A291244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291244() {
    super(new long[] {-1, -4, 1, 4}, new long[] {4, 15, 60, 239});
  }
}
