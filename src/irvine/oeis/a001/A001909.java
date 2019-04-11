package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001909 <code>a(n) = n*a(n-1) + (n-4)*a(n-2), a(2) = 0, a(3) = 1</code>.
 * @author Sean A. Irvine
 */
public class A001909 implements Sequence {

  private long mN = 1;
  private Z mA = Z.NEG_ONE;
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    ++mN;
    final Z t = mA.multiply(mN - 4).add(mB.multiply(mN));
    mA = mB;
    mB = t;
    return mB;
  }
}
