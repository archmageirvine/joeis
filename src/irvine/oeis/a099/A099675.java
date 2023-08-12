package irvine.oeis.a099;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A099675 Partial sums of repdigits of A002282.
 * @author Georg Fischer
 */
public class A099675 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A099675() {
    super(1, "[0,10,-21,12,-1]", "8", 0);
  }
}
