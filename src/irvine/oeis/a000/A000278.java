package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000278 a(n) = a(n-1) + a(n-2)^2 for n &gt;= 2 with a(0) = 0 and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A000278 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.add(mA.square());
    mA = mB;
    mB = t;
    return t;
  }
}
