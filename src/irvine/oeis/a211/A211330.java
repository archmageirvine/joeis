package irvine.oeis.a211;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A211330 Number of (n+1) X (n+1) -5..5 symmetric matrices with every 2 X 2 subblock having sum zero and three distinct values.
 * @author Georg Fischer
 */
public class A211330 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A211330() {
    super(1, "[0,46,-140,-232,972,176,-2308,596,2164,-932,-618,284]", "[1,-5,1,31,-39,-56,116,14,-115,34,30,-12]");
  }
}
