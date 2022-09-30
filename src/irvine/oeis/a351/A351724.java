package irvine.oeis.a351;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A351724 Number of compositions of n into parts of size 1, 5, 10 or 25.
 * @author Georg Fischer
 */
public class A351724 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A351724() {
    super(0, "[0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,1,-1]", "1", 0);
  }
}
