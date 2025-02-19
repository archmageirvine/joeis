package irvine.oeis.a204;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A204794 Number of (n+1) X 3 0..1 arrays with rows and columns of determinants of all 2 X 2 subblocks lexicographically nondecreasing.
 * @author Georg Fischer
 */
public class A204794 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A204794() {
    super(1, "[0,47,-42,-204,31,233,206,-65,-104]", "[1,-6,5,12,-12]");
  }
}
