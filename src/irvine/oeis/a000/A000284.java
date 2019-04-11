package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000284 <code>a(n) = a(n-1)^3 + a(n-2)</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A000284 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.pow(3).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
