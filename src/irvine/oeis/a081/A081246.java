package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081246 Triangle in which (2^n+1)st row gives trajectory of x=2^n+1 under the map x -&gt; x/2 if x is even, x -&gt; x+1 if x is odd, stopping when reaching 1.
 * @author Sean A. Irvine
 */
public class A081246 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mA.isOne()) {
      mA = Z.ONE.shiftLeft(++mN).add(1);
    } else if (mA.isEven()) {
      mA = mA.divide2();
    } else {
      mA = mA.add(1);
    }
    return mA;
  }
}
