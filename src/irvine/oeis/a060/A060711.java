package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060711 Smallest number whose digit sum is n^4.
 * @author Sean A. Irvine
 */
public class A060711 extends Sequence1 {

  // After Harry J. Smith

  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).pow(4);
    final Z x = s.divide(9);
    final Z d = s.subtract(x.multiply(9));
    return d.add(1).multiply(Z.TEN.pow(x)).subtract(1);
  }
}

