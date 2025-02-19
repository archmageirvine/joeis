package irvine.oeis.a200;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A200250 Number of 0..7 arrays x(0..n-1) of n elements with each no smaller than the sum of its previous elements modulo 8.
 * @author Georg Fischer
 */
public class A200250 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A200250() {
    super(1, "[0,8,28,56,70,56,28,8,1]", "[1,-1,-9,-24,-36,-35,-21,-7,-1]");
  }
}
