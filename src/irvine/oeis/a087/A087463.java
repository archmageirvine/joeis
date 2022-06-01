package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087463 Generalized multiplicative Jacobsthal sequence.
 * @author Sean A. Irvine
 */
public class A087463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087463() {
    super(new long[] {8, 0, 0, 7, 0, 0}, new long[] {0, 1, 1, 0, 5, 11});
  }
}
