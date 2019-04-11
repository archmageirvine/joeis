package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001099 <code>a(n) = n^n - a(n-1),</code> with <code>a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A001099 implements Sequence {

  private Z mP = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    mP = Z.valueOf(++mN).pow(mN).subtract(mP);
    return mP;
  }
}

