package irvine.oeis.a060;
// manually partsumm/partsum at 2022-03-24 22:32

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001227;

/**
 * A060831 a(n) = Sum_{k=1..n} (number of odd divisors of k) (cf. A001227).
 * @author Georg Fischer
 */
public class A060831 extends PrependSequence {

  /** Construct the sequence. */
  public A060831() {
    super(new PartialSumSequence(new A001227()), 0);
  }
}
