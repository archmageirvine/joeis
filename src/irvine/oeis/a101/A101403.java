package irvine.oeis.a101;
// manually deris/diffseq at 2026-09-22 21: 03

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a246.A246439;

/**
 * A101403 Number of times that n occurs in A101402.
 * @author Georg Fischer
 */
public class A101403 extends PrependSequence {

  /** Construct the sequence. */
  public A101403() {
    super(0, new DifferenceSequence(0, new A246439()), 1);
  }
}
