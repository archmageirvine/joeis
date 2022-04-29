package irvine.oeis.a047;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a003.A003072;
import irvine.oeis.a003.A003325;
import irvine.oeis.a003.A003327;

/**
 * A047703 Numbers that are the sum of 4 but no fewer positive cubes.
 * @author Sean A. Irvine
 */
public class A047703 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A047703() {
    super(new SetDifferenceSequence(new SetDifferenceSequence(new A003327(), new A003072()), new A003325()), new A000578());
  }
}
