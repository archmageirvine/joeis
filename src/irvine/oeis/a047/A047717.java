package irvine.oeis.a047;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000583;
import irvine.oeis.a003.A003340;
import irvine.oeis.a344.A344187;
import irvine.oeis.a344.A344188;
import irvine.oeis.a344.A344189;
import irvine.oeis.a344.A344190;

/**
 * A047717 Numbers that are the sum of 6 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A047717 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A047717() {
    super(new SetDifferenceSequence(new SetDifferenceSequence(new SetDifferenceSequence(new SetDifferenceSequence(new A003340(), new A344190()), new A344189()), new A344188()), new A344187()), new A000583());
  }
}
