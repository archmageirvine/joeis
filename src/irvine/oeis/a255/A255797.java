package irvine.oeis.a255;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A255797 Number of (n+2) X (4+2) 0..1 arrays with no 3 x 3 subblock diagonal sum 1 and no antidiagonal sum 2 and no row sum 0 and no column sum 3.
 * @author Georg Fischer
 */
public class A255797 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A255797() {
    super(1, "[0,409,262,198,200,268,263,-843,-450,-268,-256,-328,-318,374,124,16]", "[1,0,0,0,0,0,-3,0,0,0,0,0,2]");
  }
}
