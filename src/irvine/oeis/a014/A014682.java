package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014682 The Collatz or <code>3x+1</code> function: <code>a(n) = n/2</code> if n is even, otherwise <code>(3n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A014682 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isEven() ? mN.divide2() : mN.multiply(3).add(1).divide2();
  }
}
