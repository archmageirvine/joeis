package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024720 a(n) = (1/4)*(3 + Sum_{k=0..n} C(4k,k)).
 * @author Sean A. Irvine
 */
public class A024720 extends Sequence0 {

  private Z mSum = Z.THREE;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = mSum.add(Binomial.binomial(4 * ++mN, mN));
    return mSum.divide(4);
  }
}
