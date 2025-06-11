package irvine.oeis.a072;

import irvine.oeis.PolynomialFieldSequence;

/**
 * A072447 Number of connectedness systems on n vertices that contain all singletons and the set of all the vertices.
 * @author Sean A. Irvine
 */
public class A072447 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A072447() {
    super(1, "", "x,B,log", 0, EGF, 1, 1, egf(new A072446()));
  }
}

