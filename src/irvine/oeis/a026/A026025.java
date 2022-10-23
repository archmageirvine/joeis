package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026025 a(n) = (n!)^2 * (1 + Sum(k=0...n-1) 1/((k+1)(k!)^2)).
 * @author Sean A. Irvine
 */
public class A026025 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).multiply(mN).add(mN);
    }
    return mA;
  }
}

