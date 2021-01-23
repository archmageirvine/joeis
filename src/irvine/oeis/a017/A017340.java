package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017340 a(n) = (10*n + 5)^12.
 * @author Sean A. Irvine
 */
public class A017340 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(12);
  }
}

