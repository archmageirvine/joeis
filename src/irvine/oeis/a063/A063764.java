package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063764 Nonprimes k such that largest prime factor of k &gt; k^(2/3).
 * @author Sean A. Irvine
 */
public class A063764 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isProbablePrime() && Functions.GPF.z(mN).pow(3).compareTo(mN.square()) > 0) {
        return mN;
      }
    }
  }
}
