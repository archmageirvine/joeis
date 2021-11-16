package irvine.oeis.a092;
// manually deris2/partsum at 2021-11-04 15:02

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002036;

/**
 * A092847 a(n) = Sum_{k=1..n} round(prime(k) / log(prime(k))).
 * Partial sums of A002036. 
 * @author Georg Fischer
 */
public class A092847 extends PartialSumSequence {

  /** Construct the sequence. */
  public A092847() {
    super(new A002036());
  }
}
