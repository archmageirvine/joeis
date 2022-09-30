package irvine.oeis.a349;
// manually holsig/holos at 2022-09-29 22:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A349595 Number of self-counting sequences of length n (sequences indexed from 0 to (n-1) where a(i) is the number of times i appears in the sequence).
 * @author Georg Fischer
 */
public class A349595 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A349595() {
    super(1, "[0,1,-1]", "0,0,0,2,1,0,1", 0);
  }
}
