package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054987 Smallest composite x such that sigma(x+2^n) = sigma(x) + 2^n.
 * @author Sean A. Irvine
 */
public class A054987 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z f = Z.ONE.shiftLeft(++mN);
    Z k = Z.THREE;
    while (true) {
      k = k.add(1);
      if (!k.isProbablePrime() && Functions.SIGMA.z(f.add(k)).equals(Functions.SIGMA.z(k).add(f))) {
        return k;
      }
    }
  }
}
