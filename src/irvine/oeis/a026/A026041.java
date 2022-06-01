package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026041 a(n) = d(n)/2, where d = A026040.
 * @author Sean A. Irvine
 */
public class A026041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026041() {
    super(new long[] {-1, 4, -6, 4}, new long[] {12, 20, 32, 49});
  }
}
