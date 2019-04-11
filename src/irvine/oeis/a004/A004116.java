package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004116 <code>a(n) = floor((n^2 + 6n - 3)/4)</code>.
 * @author Sean A. Irvine
 */
public class A004116 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(mN.multiply(6)).subtract(3).divide(4);
  }
}
