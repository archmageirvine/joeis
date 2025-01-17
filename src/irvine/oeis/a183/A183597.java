package irvine.oeis.a183;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183597 1/6 the number of (n+1) X 4 0..2 arrays with every 2 X 2 subblock containing all three values.
 * @author Georg Fischer
 */
public class A183597 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A183597() {
    super(1, "[0,120,39,-2974,-5338,4094,5400,-3024]", "[1,-12,-20,238,420,-324,-400,224]");
  }
}
