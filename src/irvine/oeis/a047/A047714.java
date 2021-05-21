package irvine.oeis.a047;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000583;
import irvine.oeis.a003.A003337;
import irvine.oeis.a344.A344187;

/**
 * A047714 Sums of 3 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A047714 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A047714() {
    super(new SetDifferenceSequence(new A003337(), new A344187()), new A000583());
  }
}
