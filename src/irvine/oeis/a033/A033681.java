package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033681 a(1) = 3; a(n) is smallest number &gt;= a(n-1) such that the juxtaposition a(1)a(2)...a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A033681 implements Sequence {

  private final StringBuilder mA = new StringBuilder();
  private Z mPrev = Z.THREE;
  
  @Override
  public Z next() {
    while (!new Z(new StringBuilder(mA).append(mPrev)).isProbablePrime()) {
      mPrev = mPrev.add(2);
    }
    mA.append(mPrev);
    return mPrev;
  }
}
