package irvine.oeis.a243;

import irvine.oeis.FiniteSequence;

/**
 * A243023 Consider a k-digit number m = d_(k)*10^(k-1) + d_(k-1)*10^(k-2) + ... + d_(2)*10 + d_(1). Sequence lists the numbers m that divide Sum_{i=1..k-1}{d_(i+1)^d(i)}+d(1)^d(k) (see example below).
 * @author Georg Fischer
 */
public class A243023 extends FiniteSequence {

  /** Construct the sequence. */
  public A243023() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 63, 448, 1547, 1693, 6189068, 20443796, 67526389);
  }
}
