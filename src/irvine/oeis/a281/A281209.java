package irvine.oeis.a281;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A281209 Number of 5 X n 0..1 arrays with no element equal to more than one of its horizontal and antidiagonal neighbors, with the exception of exactly one element, and with new values introduced in order 0 sequentially upwards.
 * @author Georg Fischer
 */
public class A281209 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A281209() {
    super(1, "[0,0,130,-72,-596,489,422,-363,-56,114,10,-4]", "[1,-4,4,2,-4,0,1]");
  }
}
