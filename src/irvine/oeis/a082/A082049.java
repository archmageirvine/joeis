package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A082049 Least composite number greater than n-th composite number having greater smallest prime factor than that of n-th composite number.
 * @author Sean A. Irvine
 */
public class A082049 extends A002808 {

  @Override
  public Z next() {
    final Z c = super.next();
    final long lpf = Functions.LPF.l(c);
    Z k = mN;
    while (true) {
      k = k.add(1);
      if (!k.isProbablePrime() && Functions.LPF.l(k) > lpf) {
        return k;
      }
    }
  }
}
