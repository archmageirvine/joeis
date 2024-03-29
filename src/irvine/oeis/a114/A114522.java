package irvine.oeis.a114;
// Generated by gen_seq4.pl unionm/union2 at 2023-08-16 22:12

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a047.A047820;

/**
 * A114522 Numbers n such that sum of distinct prime divisors of n is prime.
 * @author Georg Fischer
 */
public class A114522 extends UnionSequence {

  /** Construct the sequence. */
  public A114522() {
    super(1, new A000040(), new A047820());
  }
}
