package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221681 Number of 0..6 arrays of length n with each element differing from at least one neighbor by 1 or less, starting with 0.
 * @author Georg Fischer
 */
public class A221681 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221681() {
    super(1, "[0,0,2,-3,8,3,6,-1,1]", "[1,-4,-5,7,-33,-17,-24,5,-2]");
  }
}
