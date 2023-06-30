package irvine.oeis.a363;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A363283 Squares (A000290) and (1+squares) (A002522), in increasing order.
 * @author Georg Fischer
 */
public class A363283 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A363283() {
    super(1, "[[0],[1],[-1],[-2],[2],[1],[-1]]", "1,2,4,5,9,10", 0);
  }
}
