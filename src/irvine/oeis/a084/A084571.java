package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084571 Let a(1)=1; for n&gt;1, a(n)=nextprime((3/2)*a(n-1)).
 * @author Sean A. Irvine
 */
public class A084571 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : Functions.NEXT_PRIME.z(mA.multiply(3).subtract(1).divide2());
    return mA;
  }
}

