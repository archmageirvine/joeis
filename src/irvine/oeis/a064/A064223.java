package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064223 a(1) = 1; a(n+1) = a(n) + number of decimal digits of a(n) for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A064223 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(mA.toString().length());
    return mA;
  }
}
