package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001595 <code>a(n) = a(n-1) + a(n-2) + 1,</code> with <code>a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A001595 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mA.add(mB).add(1);
    mA = mB;
    mB = t;
    return t;
  }
}
