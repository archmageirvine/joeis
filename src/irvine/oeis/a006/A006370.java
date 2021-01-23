package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006370 The Collatz or 3x+1 map: a(n) = n/2 if n is even, 3n + 1 if n is odd.
 * @author Sean A. Irvine
 */
public class A006370 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isEven() ? mN.divide2() : mN.multiply(3).add(1);
  }
}
