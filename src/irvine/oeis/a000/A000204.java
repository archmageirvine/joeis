package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000204 Lucas numbers (beginning with 1): L(n) = L(n-1) + L(n-2) with L(1) = 1, L(2) = 3.
 * @author Sean A. Irvine
 */
public class A000204 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    final Z n = mA.add(mB);
    mA = mB;
    mB = n;
    return n;
  }

}

