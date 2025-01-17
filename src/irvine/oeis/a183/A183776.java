package irvine.oeis.a183;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183776 Half the number of (n+1) X 4 binary arrays with no 2 X 2 subblock having exactly 2 ones.
 * @author Georg Fischer
 */
public class A183776 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A183776() {
    super(1, "[0,33,95,-186,-494,280,512]", "[1,-2,-18,13,70,-24,-64]");
  }
}
