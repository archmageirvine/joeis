package irvine.oeis.a034;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a008.A008784;

/**
 * A034024 Imprimitively but not primitively represented by <code>x^2+y^2</code>.
 * @author Sean A. Irvine
 */
public class A034024 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A034024() {
    super(new A034023(), new A008784());
  }
}
