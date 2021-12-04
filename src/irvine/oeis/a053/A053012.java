package irvine.oeis.a053;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000292;
import irvine.oeis.a000.A000578;
import irvine.oeis.a005.A005900;
import irvine.oeis.a006.A006564;
import irvine.oeis.a006.A006566;

/**
 * A053012 Platonic numbers: a(n) is a tetrahedral (A000292), cube (A000578), octahedral (A005900), dodecahedral (A006566) or icosahedral (A006564) number.
 * @author Sean A. Irvine
 */
public class A053012 extends UnionSequence {

  /** Construct the sequence. */
  public A053012() {
    super(new A000292(), new A000578(), new A005900(), new A006566(), new A006564());
    next();
  }
}
