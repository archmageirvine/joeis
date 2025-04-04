package irvine.oeis.a231;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A231356 Number of (n+1) X (1+1) 0..3 arrays with no element unequal to a strict majority of its horizontal, vertical and antidiagonal neighbors, with values 0..3 introduced in row major order.
 * @author Georg Fischer
 */
public class A231356 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A231356() {
    super(1, "[0,1,-1,-7,-5,11,13,3]", "[1,-3,-5,5,24,2,-15,-9]");
  }
}
