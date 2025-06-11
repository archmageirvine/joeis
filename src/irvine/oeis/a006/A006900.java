package irvine.oeis.a006;

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000081;

/**
 * A006900 Log of g.f. for rooted trees.
 * @author Sean A. Irvine
 */
public class A006900 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A006900() {
    super(0, "", "x,B,log", 0, EGF, 1, 1, egf(new PrependSequence(new A000081().skip(), 1)));
    next();
  }
}
