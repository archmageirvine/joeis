package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A062119 <code>a(n) = n! * (n-1)</code>.
 * @author Sean A. Irvine
 */
public class A062119 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(mN - 1);
  }
}

