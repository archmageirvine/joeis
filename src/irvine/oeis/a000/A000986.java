package irvine.oeis.a000;

import irvine.math.q.Q;

/**
 * A000986 Number of n X n symmetric matrices with (0,1) entries and all row sums 2.
 * @author Sean A. Irvine
 */
public class A000986 extends A000985 {

  /** Construct the sequence. */
  public A000986() {
    super(Q.ZERO, new Q(-1, 2), Q.ONE_QUARTER);
  }
}

