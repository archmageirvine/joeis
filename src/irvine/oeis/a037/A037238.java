package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037238 x -&gt; 5x - 1 if x odd, else x -&gt; x/2.
 * @author Sean A. Irvine
 */
public class A037238 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(19) : (mA.isEven() ? mA.divide2() : mA.multiply(5).subtract(1));
    return mA;
  }
}
