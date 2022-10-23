package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024719 a(n) = (1/3)*(2 + Sum_{k=0..n} C(3k,k)).
 * @author Sean A. Irvine
 */
public class A024719 extends Sequence0 {

  private Z mSum = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = mSum.add(Binomial.binomial(3 * ++mN, mN));
    return mSum.divide(3);
  }
}
