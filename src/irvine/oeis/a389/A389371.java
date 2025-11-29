package irvine.oeis.a389;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389371 Number of distinct branching structures with up to 3 branches per node after n generations.
 * @author Sean A. Irvine
 */
public class A389371 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : Binomial.binomial(mA, 0).add(Binomial.binomial(mA, 1)).add(Binomial.binomial(mA, 2)).add(Binomial.binomial(mA, 3));
    return mA;
  }
}
