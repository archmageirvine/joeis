package irvine.oeis.a120;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A120740 Numbers n such that n = Sum_digits[k*abs(n-k)] for some k&gt;=0.
 * @author Georg Fischer
 */
public class A120740 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A120740() {
    super(1, "[0,0,4,1,0,4]", "[1,-1,-1,1]");
  }
}
