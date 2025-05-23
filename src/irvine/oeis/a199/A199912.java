package irvine.oeis.a199;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A199912 Number of -n..n arrays x(0..4) of 5 elements with zero sum, and adjacent elements not equal modulo three (with -1 modulo 3 = 2).
 * @author Georg Fischer
 */
public class A199912 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A199912() {
    super(1, "[0,14,68,174,492,760,664,760,492,174,68,14]", "[1,-1,0,-4,4,0,6,-6,0,-4,4,0,1,-1]");
  }
}
