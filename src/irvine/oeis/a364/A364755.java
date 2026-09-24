package irvine.oeis.a364;
// manually deris/diffseq at 2026-09-22 21: 03

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a085.A085489;

/**
 * A364755 Number of subsets of {1..n} containing n but not containing the sum of any two distinct elements.
 * @author Georg Fischer
 */
public class A364755 extends PrependSequence {

  /** Construct the sequence. */
  public A364755() {
    super(0, new DifferenceSequence(0, new A085489()), 0);
  }
}
