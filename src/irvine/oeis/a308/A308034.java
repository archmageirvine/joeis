package irvine.oeis.a308;
// Generated by gen_seq4.pl holos [[0],[-1],[2],[-2],[2],[-1],[0],[1],[-2],[2],[-2],[1]] [0,0,0,0,2,1,4,4,6,8,10] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A308034 Number of partitions of n into 3 parts with at least 1 part that is a nondivisor of n.
 * @author Georg Fischer
 */
public class A308034 extends HolonomicRecurrence implements Conjectural {


  /** Construct the sequence. */
  public A308034() {
    super(1, "[[0],[-1],[2],[-2],[2],[-1],[0],[1],[-2],[2],[-2],[1]]", "[0,0,0,0,2,1,4,4,6,8,10]", 0);
  }
}
