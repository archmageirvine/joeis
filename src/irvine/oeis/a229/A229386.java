package irvine.oeis.a229;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A229386 Number of n X 2 0..3 arrays of the sum of the corresponding element, the element to the east and the element to the south in a larger (n+1) X 3 0..1 array.
 * @author Georg Fischer
 */
public class A229386 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A229386() {
    super(1, "[0,14,-40,32,-16]", "[1,-12,36,-32,16]");
  }
}
