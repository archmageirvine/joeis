package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214675 a(n) = 9*n^2 - 13*n + 5.
 * @author Sean A. Irvine
 */
public class A214675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214675() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 15, 47});
  }
}
