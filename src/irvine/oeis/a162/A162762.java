package irvine.oeis.a162;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A162762 Minimal number of floors an elevator must move to transport n passengers initially waiting at floors i = 1, ..., n to their destinations, floor n+1-i (= n, ..., 1), if the elevator can transport at most C = 2 persons at a time and starts at floor 1, and no one may get off the elevator before reaching their destination.
 * @author Georg Fischer
 */
public class A162762 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A162762() {
    super(1, "[0,0,2,0,0,0,2,-2]", "[1,-2,1,0,-1,2,-1]");
  }
}
