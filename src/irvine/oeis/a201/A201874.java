package irvine.oeis.a201;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A201874 Number of zero-sum -n..n arrays of 3 elements with first and second differences also in -n..n.
 * @author Georg Fischer
 */
public class A201874 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A201874() {
    super(1, "[0,3,2,10,0,2,0,1]", "[1,-1,0,-2,2,0,1,-1]");
  }
}
