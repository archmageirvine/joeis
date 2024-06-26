package irvine.oeis.a227;
// Generated by gen_seq4.pl 2024-05-09/setdiff at 2024-05-09 22:36

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a001.A001358;
import irvine.oeis.a007.A007921;

/**
 * A227030 Numbers that are neither the difference nor the product of two primes.
 * @author Georg Fischer
 */
public class A227030 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A227030() {
    super(1, new A007921(), new A001358());
  }
}
