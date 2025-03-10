package irvine.oeis.a222;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A222942 Number of n X 4 0..4 arrays with no element equal to another at a city block distance of exactly two, and new values 0..4 introduced in row major order.
 * @author Georg Fischer
 */
public class A222942 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A222942() {
    super(1, "[0,7,154,287,-2824,1536]", "[1,-17,-136,512]");
  }
}
