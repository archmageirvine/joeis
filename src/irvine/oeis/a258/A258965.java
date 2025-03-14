package irvine.oeis.a258;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A258965 Number of (n+2) X (7+2) 0..1 arrays with no 3 X 3 subblock diagonal sum 0 and no antidiagonal sum 3 and no row sum 0 or 3 and no column sum 0 or 3.
 * @author Georg Fischer
 */
public class A258965 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A258965() {
    super(1, "[0,2040,1228,-5664,-3022,3264,1258,-24,6,24,8]", "[1,0,-3,0,2]");
  }
}
