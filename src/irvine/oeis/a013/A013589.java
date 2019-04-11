package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013589 <code>a(n+1) = a(n)*(a(n)+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A013589 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.multiply(mA.add(1)).divide2();
    return mA;
  }
}
