package irvine.oeis.a222;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A222125 Number of binary arrays indicating the locations of trailing edge maxima of a random length-n 0..6 array extended with zeros and convolved with 1,2,1.
 * @author Georg Fischer
 */
public class A222125 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A222125() {
    super(1, "[0,2,1,1,2,1,1,1,-2,0,0,-1,0,-1,0,1]", "[1,-1,0,-1,0,-1,0,-2,1,0,0,0,0,0,1,-1]");
  }
}
