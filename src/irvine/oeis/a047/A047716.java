package irvine.oeis.a047;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000583;
import irvine.oeis.a003.A003339;
import irvine.oeis.a344.A344187;
import irvine.oeis.a344.A344188;
import irvine.oeis.a344.A344189;

/**
 * A047716 Numbers that are the sum of 5 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A047716 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A047716() {
    super(new SetDifferenceSequence(new SetDifferenceSequence(new SetDifferenceSequence(new A003339(), new A344189()), new A344188()), new A344187()), new A000583());
  }
}
