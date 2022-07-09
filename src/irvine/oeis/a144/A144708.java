package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144708 a(n) = 6^n * (1-4*n).
 * @author Sean A. Irvine
 */
public class A144708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144708() {
    super(new long[] {-36, 12}, new long[] {1, -18});
  }
}
