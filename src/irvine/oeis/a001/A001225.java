package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a003.A003141;

/**
 * A001225 Number of consistent arcs in a tournament with n nodes.
 * @author Sean A. Irvine
 */
public class A001225 extends A003141 {

  /** Construct the sequence. */
  public A001225() {
    super(2);
  }

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return Binomial.binomial(mN, 2).subtract(t);
  }

}

