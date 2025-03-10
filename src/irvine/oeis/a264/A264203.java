package irvine.oeis.a264;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A264203 Number of (n+1) X (3+1) arrays of permutations of 0..n*4+3 with each element having index change +-(.,.) 0,0 0,2 or 1,0.
 * @author Georg Fischer
 */
public class A264203 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A264203() {
    super(1, "[0,81,133,-187,-43,4]", "[1,-11,-44,44,11,-1]");
  }
}
