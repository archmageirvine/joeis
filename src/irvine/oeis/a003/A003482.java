package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003482 <code>a(n) = 7*a(n-1) - a(n-2) + 4</code>, with <code>a(0) = 0, a(1) = 5</code>.
 * @author Sean A. Irvine
 */
public class A003482 implements Sequence {

  private Z mA = Z.valueOf(-3);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(7).subtract(mA).add(4);
    mA = mB;
    mB = t;
    return mB;
  }
}

