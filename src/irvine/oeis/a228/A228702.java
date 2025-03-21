package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228702 Wiener index of generalized Fibonacci cube graph Q_n(111).
 * @author Georg Fischer
 */
public class A228702 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A228702() {
    super(0, "[0,1,4,2,4,1]", "[1,-4,-2,0,35,32,32,-16,-5,-12,2,0,1]");
  }
}
