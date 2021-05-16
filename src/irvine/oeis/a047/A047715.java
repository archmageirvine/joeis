package irvine.oeis.a047;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000583;
import irvine.oeis.a003.A003338;
import irvine.oeis.a344.A344187;
import irvine.oeis.a344.A344188;

/**
 * A047715 Numbers that are the sum of 4 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A047715 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A047715() {
    super(new SetDifferenceSequence(new SetDifferenceSequence(new A003338(), new A344188()), new A344187()), new A000583());
  }
}
