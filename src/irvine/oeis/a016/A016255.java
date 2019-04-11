package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016255 Expansion of <code>1/((1-x)(1-7x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A016255 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    if (mB == null) {
      mB = Z.valueOf(20);
    } else {
      final Z t = mB.multiply(19).subtract(mA.multiply(84)).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
