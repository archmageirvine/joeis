package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000213 Tribonacci numbers: a(n) = a(n-1) + a(n-2) + a(n-3) with a(0)=a(1)=a(2)=1.
 * @author Sean A. Irvine
 */
public class A000213 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z r = mA.add(mB).add(mC);
    mA = mB;
    mB = mC;
    mC = r;
    return r;
  }
}

