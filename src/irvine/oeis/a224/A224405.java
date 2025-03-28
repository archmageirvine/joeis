package irvine.oeis.a224;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A224405 Number of n X 4 0..1 arrays with rows unimodal and antidiagonals nondecreasing.
 * @author Georg Fischer
 */
public class A224405 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A224405() {
    super(1, "[0,11,1,3,2]", "[1,-5,5,-2,-4]");
  }
}
