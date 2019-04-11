package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006370 The Collatz or <code>3x+1</code> map: <code>a(n) = n/2</code> if n is even, <code>3n + 1</code> if n is odd.
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
