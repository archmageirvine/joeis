package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145063 Hankel transform of A145062.
 * @author Sean A. Irvine
 */
public class A145063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145063() {
    super(new long[] {-1, 0, -3, 0, -3, 0}, new long[] {1, -1, -3, 1, 6, -1});
  }
}
