package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000904 <code>a(n) = (n+1)*a(n-1) + (n+2)*a(n-2) + a(n-3)</code>; <code>a(1)=0, a(2)=3, a(3)=13</code>.
 * @author Sean A. Irvine
 */
public class A000904 implements Sequence {

  private long mN = 1;
  private Z mA = Z.ONE;
  private Z mB = Z.NEG_ONE;
  private Z mC = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    final Z t = mC.multiply(mN).add(mB.multiply(mN + 1)).add(mA);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

