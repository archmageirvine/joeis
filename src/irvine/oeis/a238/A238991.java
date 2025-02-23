package irvine.oeis.a238;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A238991 Number of n X 2 0..3 arrays with no element equal to two plus the sum of elements to its left or two plus the sum of the sum of elements above it, modulo 4.
 * @author Georg Fischer
 */
public class A238991 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A238991() {
    super(1, "[0,7,-1,-50,32,85,-53,-80,52,16]", "[1,-6,-1,48,-49,-70,77,68,-52,-16]");
  }
}
