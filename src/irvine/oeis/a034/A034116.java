package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034116 Decimal part of cube root of <code>a(n)</code> starts with digit <code>0</code> (cubes excluded).
 * @author Sean A. Irvine
 */
public class A034116 implements Sequence {

  private Z mN = Z.ONE;
  private Z mM = Z.TWO;
  private Z mNextCube = Z.EIGHT;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mNextCube)) {
        mM = mM.add(1);
        mNextCube = mM.pow(3);
      } else if (ComputableReals.SINGLETON.pow(CR.valueOf(mN), CR.ONE_THIRD).frac().multiply(10).floor().longValue() == 0) {
        return mN;
      }
    }
  }
}

