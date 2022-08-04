package irvine.oeis.a058;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058321 Number of x such that phi(x) = 2^n.
 * @author Sean A. Irvine
 */
public class A058321 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return Z.valueOf(Euler.inversePhi(mN).size());
  }
}

