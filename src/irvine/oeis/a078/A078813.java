package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078813 Smallest prime factor of googol - n that exceeds 13, or 1 if googol - n is 13-smooth.
 * @author Sean A. Irvine
 */
public class A078813 extends Sequence0 {

  private static final Z Z13 = Z.valueOf(13);
  private static final Z GOOGOL = Z.TEN.pow(100);
  private long mN = -1;

  @Override
  public Z next() {
    Z t = GOOGOL.subtract(++mN).makeOdd();
    while (true) {
      final Z res = Functions.LPF.z(t);
      if (Z.ONE.equals(res) || res.compareTo(Z13) > 0) {
        return res;
      }
      t = t.divide(res);
    }
  }
}
