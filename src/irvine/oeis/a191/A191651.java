package irvine.oeis.a191;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A191651 Ratio A191650(n+1)/A191650(n).
 * @author Georg Fischer
 */
public class A191651 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A191651() {
    super(1, "[0,2,0,0,0,2,1,0,-1,-1]", "[1,-1,0,-1,1,-1,-1,0,0,1]");
  }
}
