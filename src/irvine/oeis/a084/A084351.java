package irvine.oeis.a084;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A084351 Length of period of sequences r(k,n)=floor(sin(1)*k!)-n*floor(sin(1)*k!/n) when n is fixed.
 * @author Georg Fischer
 */
public class A084351 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A084351() {
    super(1, "[0,1,4,12,4,18,4,4,0,-3]", "[1,0,0,0,-2,0,0,0,1]");
  }
}
