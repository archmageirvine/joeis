package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033156 <code>a(1) = 1;</code> for m <code>&gt;= 2, a(n) = a(n-1) + floor(a(n-1)/(n-1)) + 2</code>.
 * @author Sean A. Irvine
 */
public class A033156 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(mA.divide(mN)).add(2);
    }
    return mA;
  }
}
