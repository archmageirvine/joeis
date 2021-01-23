package irvine.oeis.a145;
// Manually modified 2020-09-22

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a031.A031443;

/**
 * A145058 Second differences of A031443.
 * @author Georg Fischer
 */
public class A145058 extends PrependSequence {

  /** Construct the sequence. */
  public A145058() {
    super(new DifferenceSequence(new DifferenceSequence(new A031443())),  2, 5);
  }
}
