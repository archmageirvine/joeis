package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000308 <code>a(n)=a(n-1)*a(n-2)*a(n-3)</code> with <code>a(1)=1, a(2)=2</code> and <code>a(3)=3</code>.
 * @author Sean A. Irvine
 */
public class A000308 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    if (mB == null) {
      mB = Z.TWO;
      return Z.TWO;
    }
    if (mC == null) {
      mC = Z.THREE;
      return Z.THREE;
    }
    final Z t = mA.multiply(mB).multiply(mC);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

