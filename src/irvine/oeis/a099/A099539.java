package irvine.oeis.a099;
// manually partsumm/partsum at 2022-04-12

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002193;

/**
 * A099539 Sum of the first n decimal places of sqrt(2).
 * @author Georg Fischer
 */
public class A099539 extends PartialSumSequence {

  /** Construct the sequence. */
  public A099539() {
    super(new SkipSequence(new A002193(), 1));
  }
}
