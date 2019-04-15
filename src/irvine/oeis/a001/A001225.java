package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a003.A003141;

/**
 * A001225 Consistent arcs in a tournament (equals <code>C(n,2) -</code> A003141).
 * @author Sean A. Irvine
 */
public class A001225 extends A003141 {

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

