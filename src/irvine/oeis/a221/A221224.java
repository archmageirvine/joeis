package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221224 Number of n X 3 arrays of occupancy after each element stays put or moves to some king-move neighbor.
 * @author Georg Fischer
 */
public class A221224 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221224() {
    super(1, "[0,8,-216,1648,-4760,4616,-1168]", "[1,-77,1710,-13925,39617,-25616,5184]");
  }
}
