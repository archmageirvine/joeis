package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003312 a(1) = 3; for n&gt;0, a(n+1) = a(n) + floor((a(n)-1)/2).
 * @author Sean A. Irvine
 */
public class A003312 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.add(mA.subtract(1).divide2());
    return mA;
  }

}
