package irvine.oeis.a047;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a003.A003328;
import irvine.oeis.a025.A025395;
import irvine.oeis.a025.A025403;
import irvine.oeis.a338.A338667;

/**
 * A047704 Numbers that are the sum of 5 but no fewer positive cubes.
 * @author Sean A. Irvine
 */
public class A047704 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A047704() {
    super(new SetDifferenceSequence(new SetDifferenceSequence(new SetDifferenceSequence(new A003328(), new A025403()), new A025395()), new A338667()), new A000578());
  }
}
