package irvine.oeis.a124;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A124869 Numerator of real part of (3*i - 1)^(-n).
 * @author Georg Fischer
 */
public class A124869 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A124869() {
    super(0, "[1,-1,-2,13,-7,-65,39,125,0,0,-625]", "[1,0,0,0,-14,0,0,0,625]");
  }
}
