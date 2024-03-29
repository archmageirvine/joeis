package irvine.oeis.a308;
// Generated by gen_seq4.pl holos [[0],[-1],[1],[-1],[1],[1],[-1],[2],[-2],[1],[-1],[-1],[1],[-1],[1]] [0,0,1,0,0,0,2,1,1,0,3,2,2,1] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A308067 Number of integer-sided triangles with perimeter n whose longest side length is odd.
 * @author Georg Fischer
 */
public class A308067 extends HolonomicRecurrence implements Conjectural {


  /** Construct the sequence. */
  public A308067() {
    super(1, "[[0],[-1],[1],[-1],[1],[1],[-1],[2],[-2],[1],[-1],[-1],[1],[-1],[1]]", "[0,0,1,0,0,0,2,1,1,0,3,2,2,1]", 0);
  }
}
