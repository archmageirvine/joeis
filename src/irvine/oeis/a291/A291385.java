package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291385 a(n) = (1/4)*A073388(n+1).
 * @author Sean A. Irvine
 */
public class A291385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291385() {
    super(new long[] {-4, -8, 0, 4}, new long[] {1, 4, 14, 47});
  }
}
