package irvine.oeis.a255;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A255021 Number of (n+2) X (2+2) 0..1 arrays with no 3 x 3 subblock diagonal sum 0 or 1 and no antidiagonal sum 0 or 1 and no row sum 0 or 1 and no column sum 0 or 1.
 * @author Georg Fischer
 */
public class A255021 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A255021() {
    super(1, "[0,54,80,163,124,10,-73,-68,-31,-2]", "[1,-1,-2,-6,-5,-1,2,2,1]");
  }
}
