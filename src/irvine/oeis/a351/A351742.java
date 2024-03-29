package irvine.oeis.a351;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A351742 Number of partitions of 2n into n parts of size 1, 5, 10 or 25.
 * @author Georg Fischer
 */
public class A351742 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A351742() {
    super(0, "[0,1,0,0,0,-1,0,0,0,0,-1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,-1,0,0,0,1,0,0,0,0,1,0,0,0,-1]", "1,0,0,0,1,0,0,0,1,1,0,0,1,1,0,0,1,1,1,0,1,1,1,0,2,1,1,1,2,1,1,1,2,2,1,1,3,2", 0);
  }
}
