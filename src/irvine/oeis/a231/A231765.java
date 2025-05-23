package irvine.oeis.a231;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A231765 Number of (1+1) X (n+1) 0..1 arrays with no element having a strict majority of its horizontal, diagonal and antidiagonal neighbors equal to one.
 * @author Georg Fischer
 */
public class A231765 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A231765() {
    super(1, "[0,9,6,1,6,-80,-10,0,-8,32]", "[1,-3,0,-1,-7,20,2,0,4,-8]");
  }
}
