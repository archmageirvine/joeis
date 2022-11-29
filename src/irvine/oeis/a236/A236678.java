package irvine.oeis.a236;

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a079.A079599;

/**
 * A236678 Partial sums of the characteristic function of A079599.
 * @author Georg Fischer
 */
public class A236678 extends PartialSumSequence {

  /** Construct the sequence. */
  public A236678() {
    super(0, new CharacteristicFunction(0, new A079599(), true, 4));
  }
}
