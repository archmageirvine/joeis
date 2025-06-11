package irvine.oeis.a007;

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.PrependSequence;

/**
 * A007108 Number of connected labeled 2-regular digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007108 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A007108() {
    super(0, "", "x,B,log", 0, EGF, 1, 1, egf(new PrependSequence(new A007107().skip(), 1)));
  }
}
