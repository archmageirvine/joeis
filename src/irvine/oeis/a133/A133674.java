package irvine.oeis.a133;
// manually diffs/diffseq at 2023-09-23 21:26

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a061.A061395;

/**
 * A133674 a(n) = |A061395(n+1) - A061395(n)|.
 * @author Georg Fischer
 */
public class A133674 extends DifferenceSequence {

  /** Construct the sequence. */
  public A133674() {
    super(1, new A061395(), true);
  }
}
