package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291224 p-INVERT of (0,1,0,1,0,1,...), where p(S) = (1 - S)^4.
 * @author Sean A. Irvine
 */
public class A291224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291224() {
    super(new long[] {-1, -4, -2, 8, 5, -8, -2, 4}, new long[] {4, 10, 24, 55, 120, 254, 524, 1059});
  }
}
