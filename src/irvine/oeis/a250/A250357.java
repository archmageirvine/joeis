package irvine.oeis.a250;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250357 Number of length n arrays x(i), i=1..n with x(i) in i..i+4 and no value appearing more than 3 times.
 * @author Georg Fischer
 */
public class A250357 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A250357() {
    super(1, "[0,5,0,0,-2,-11,0,0,1]", "[1,-5,0,0,2,11,0,0,-1]");
  }
}
