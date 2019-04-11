package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087462 Generalized <code>mod 3</code> multiplicative Jacobsthal sequence.
 * @author Sean A. Irvine
 */
public class A087462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087462() {
    super(new long[] {8, 0, 0, 7, 0, 0}, new long[] {1, 1, 1, 8, 5, 11});
  }
}
