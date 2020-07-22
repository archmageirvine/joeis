package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033936 <code>a(n+1)=a(n) +</code> sum of squares of digits of <code>a(n)</code>.
 * @author Sean A. Irvine
 */
public class A033936 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(ZUtils.digitSumSquares(mA));
    return mA;
  }
}
