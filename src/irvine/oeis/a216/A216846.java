package irvine.oeis.a216;
// Generated by gen_seq4.pl unionm/union2 at 2023-08-15 07:12

import irvine.oeis.UnionSequence;
import irvine.oeis.a001.A001122;
import irvine.oeis.a002.A002808;

/**
 * A216846 Union of the composite numbers and the primes for which 2 is a primitive root.
 * @author Georg Fischer
 */
public class A216846 extends UnionSequence {

  /** Construct the sequence. */
  public A216846() {
    super(1, new A002808(), new A001122());
  }
}
