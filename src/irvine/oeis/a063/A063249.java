package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063249 Doubly hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A063249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063249() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 66, 435, 1540});
  }
}
