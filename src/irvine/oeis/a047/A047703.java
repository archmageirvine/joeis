package irvine.oeis.a047;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a003.A003327;
import irvine.oeis.a025.A025395;
import irvine.oeis.a338.A338667;

/**
 * A047703.
 * @author Sean A. Irvine
 */
public class A047703 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A047703() {
    super(new SetDifferenceSequence(new SetDifferenceSequence(new A003327(), new A025395()), new A338667()), new A000578());
  }
}
