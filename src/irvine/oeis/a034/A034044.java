package irvine.oeis.a034;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000378;

/**
 * A034044 Numbers that are primitively but not imprimitively represented by x^2+y^2+z^2.
 * @author Sean A. Irvine
 */
public class A034044 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A034044() {
    super(new A000378(), new A034043());
  }
}
