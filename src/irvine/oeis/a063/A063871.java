package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063871 Trajectory of 3 under map n-&gt;7n-1 if n odd, n-&gt;n/2 if n even.
 * @author Sean A. Irvine
 */
public class A063871 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.isOdd() ? mA.multiply(7).subtract(1) : mA.divide2();
    return mA;
  }
}
