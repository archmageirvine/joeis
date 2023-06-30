package irvine.oeis.a363;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A363268 Squares (A000290) alternating with 1+squares (A002522).
 * @author Georg Fischer
 */
public class A363268 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A363268() {
    super(1, "[[0],[1],[-1],[-2],[2],[1],[-1]]", "1,1,4,2,9", 0);
  }
}
