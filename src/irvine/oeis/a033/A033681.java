package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033681 <code>a(1) = 3; a(n)</code> is smallest number <code>&gt;= a(n-1)</code> such that the juxtaposition <code>a(1)a(2)...a(n)</code> is a prime.
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
