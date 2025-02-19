package irvine.oeis.a231;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A231126 Number of (n+1) X (3+1) white-square subarrays of 0..2 arrays with no element equal to a strict majority of its diagonal and antidiagonal neighbors, with values 0..2 introduced in row major order.
 * @author Georg Fischer
 */
public class A231126 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A231126() {
    super(1, "[0,6,-2,-20,-24,36,16,-16]", "[1,-7,-8,32,38,-40,-56,16,16]");
  }
}
