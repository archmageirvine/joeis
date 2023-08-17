package irvine.oeis.a084;
// manually robots/union2 at 2023-08-15 15:43

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a002.A002473;
import irvine.oeis.a005.A005843;
import irvine.oeis.a008.A008585;
import irvine.oeis.a008.A008587;
import irvine.oeis.a008.A008589;

/**
 * A084891 Multiples of 2, 3, 5, or 7, but not 7-smooth.
 * @author Georg Fischer
 */
public class A084891 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A084891() {
    super(1, new UnionSequence(new A005843().skip(1), new A008585().skip(1), new A008587().skip(1), new A008589().skip(1)), new A002473());
  }
}
