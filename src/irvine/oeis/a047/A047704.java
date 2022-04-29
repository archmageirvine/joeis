package irvine.oeis.a047;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a003.A003072;
import irvine.oeis.a003.A003325;
import irvine.oeis.a003.A003328;

/**
 * A047704 Numbers that are the sum of 5 but no fewer positive cubes.
 * @author Sean A. Irvine
 */
public class A047704 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A047704() {
    super(new SetDifferenceSequence(new SetDifferenceSequence(new SetDifferenceSequence(new A003328(), new A047703()), new A003072()), new A003325()), new A000578());
  }
}
