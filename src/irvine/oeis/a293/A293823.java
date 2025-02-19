package irvine.oeis.a293;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A293823 Number of integer-sided hexagons having perimeter n, modulo rotations but not reflections.
 * @author Georg Fischer
 */
public class A293823 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A293823() {
    super(6, "[0,0,0,0,0,0,1,1,0,5,10,7,3,6,4,2]", "[1,0,-4,-1,6,4,-5,-6,5,5,-6,-5,4,6,-1,-4,0,1]");
  }
}
