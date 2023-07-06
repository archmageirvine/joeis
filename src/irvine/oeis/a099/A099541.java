package irvine.oeis.a099;
// manually partsumm/partsum at 2022-04-12

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a053.A053510;

/**
 * A099541 Sum of the first n decimal places of log(Pi).
 * @author Georg Fischer
 */
public class A099541 extends PartialSumSequence {

  /** Construct the sequence. */
  public A099541() {
    super(1, new A053510().skip(1));
  }
}
