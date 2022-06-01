package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082113 n^4+5n^2+1.
 * @author Sean A. Irvine
 */
public class A082113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082113() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 7, 37, 127, 337});
  }
}
