package irvine.oeis.a054;

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007080;

/**
 * A054957 Number of labeled connected Eulerian digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A054957 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A054957() {
    super(1, "", "x,B,log", 0, EGF, 1, 1, egf(new PrependSequence(new A007080(), 1)));
  }
}
