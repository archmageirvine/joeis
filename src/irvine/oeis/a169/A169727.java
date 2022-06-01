package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169727 a(n) = 3*(2^(n+1)-2)*(2^(n+1)-1) + 1.
 * @author Sean A. Irvine
 */
public class A169727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169727() {
    super(new long[] {8, -14, 7}, new long[] {1, 19, 127});
  }
}
