package irvine.oeis.a096;
// manually 2026-10-04/diffs at 2026-10-04 

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007917;

/**
 * A096501 Difference between primes preceding n+1 and n.
 * @author Georg Fischer
 */
public class A096501 extends PrependSequence {

  /** Construct the sequence. */
  public A096501() {
    super(1, new DifferenceSequence(1, new A007917()), 0, 4);
  }
}
