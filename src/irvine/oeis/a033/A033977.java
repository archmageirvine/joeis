package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033977 Trajectory of 1 under map <code>n-&gt;43n+1</code> if n odd, <code>n-&gt;n/2</code> if n even.
 * @author Sean A. Irvine
 */
public class A033977 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.isEven() ? mA.divide2() : mA.multiply(43).add(1);
    return mA;
  }
}
