package irvine.oeis.a136;
// Generated by gen_seq4.pl union/union2 at 2023-08-16 22:08

import irvine.oeis.UnionSequence;
import irvine.oeis.a004.A004779;
import irvine.oeis.a004.A004781;

/**
 * A136037 Numbers with at least three adjacent equal digits in binary representation.
 * @author Georg Fischer
 */
public class A136037 extends UnionSequence {

  /** Construct the sequence. */
  public A136037() {
    super(1, new A004779(), new A004781());
  }
}
