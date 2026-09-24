package irvine.oeis.a364;
// manually deris/diffseq at 2026-09-22 21: 03

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a088.A088809;

/**
 * A364756 Number of subsets of {1..n} containing n and some element equal to the sum of two distinct others.
 * @author Georg Fischer
 */
public class A364756 extends PrependSequence {

  /** Construct the sequence. */
  public A364756() {
    super(0, new DifferenceSequence(0, new A088809()), 0);
  }
}
