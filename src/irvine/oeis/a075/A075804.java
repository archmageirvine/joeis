package irvine.oeis.a075;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a035.A035132;

/**
 * A075804 Differences between adjacent palindromic nonsquarefree numbers A035132.
 * @author Sean A. Irvine
 */
public class A075804 extends DifferenceSequence {

  /** Construct the sequence. */
  public A075804() {
    super(1, new A035132());
  }
}
