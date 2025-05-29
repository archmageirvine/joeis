package irvine.oeis.a077;

import java.util.Arrays;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a025.A025487;

/**
 * A077560 Second smallest integer of prime signature corresponding to that of A025487.
 * @author Sean A. Irvine
 */
public class A077560 extends Sequence2 {

  private final Sequence mA = new A025487().skip();

  @Override
  public Z next() {
    final Z n = mA.next();
    final int[] sig = FactorUtils.sortedPrimeSignature(n);
    Z k = n;
    while (true) {
      k = k.add(1);
      if (Arrays.equals(sig, FactorUtils.sortedPrimeSignature(k))) {
        return k;
      }
    }
  }
}
