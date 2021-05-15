package irvine.oeis.a047;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a003.A003072;
import irvine.oeis.a003.A003325;

/**
 * A047702 Numbers that are the sum of 3 but no fewer positive cubes.
 * @author Sean A. Irvine
 */
public class A047702 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A047702() {
    super(new SetDifferenceSequence(new A003072(), new A000578()), new A003325());
  }
}
