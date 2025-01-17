package irvine.oeis.a179;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A179580 Number of permutations of 1..n+5 with the number moved left exceeding the number moved right by n or more.
 * @author Georg Fischer
 */
public class A179580 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A179580() {
    super(1, "[0,219,-1218,2658,-2866,1536,-328]", "[1,-8,26,-44,41,-20,4]");
  }
}
