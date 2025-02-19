package irvine.oeis.a006;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A006360 Antichains (or order ideals) in the poset 2*2*3*n or size of the distributive lattice J(2*2*3*n).
 * @author Georg Fischer
 */
public class A006360 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A006360() {
    super(0, "[1,37,315,873,873,315,37,1]", "[1,-13,78,-286,715,-1287,1716,-1716,1287,-715,286,-78,13,-1]");
  }
}
