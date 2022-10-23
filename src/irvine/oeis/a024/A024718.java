package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024718 a(n) = (1/2)*(1 + Sum_{k=0..n} binomial(2*k, k)).
 * @author Sean A. Irvine
 */
public class A024718 extends Sequence0 {

  private Z mSum = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = mSum.add(Binomial.binomial(2 * ++mN, mN));
    return mSum.divide2();
  }
}
