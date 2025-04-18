package irvine.oeis.a211;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A211254 Number of (n+1) X (n+1) -6..6 symmetric matrices with every 2 X 2 subblock having sum zero and three distinct values.
 * @author Georg Fischer
 */
public class A211254 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A211254() {
    super(1, "[0,64,-190,-404,1530,616,-4384,474,5522,-1752,-2986,1208,568,-248]", "[1,-5,0,36,-41,-82,151,54,-204,28,110,-36,-20,8]");
  }
}
