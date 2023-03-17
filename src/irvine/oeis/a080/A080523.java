package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080523 a(n) = n^n - n(n-1)/2.
 * @author Georg Fischer
 */
public class A080523 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN).subtract(mN * (mN - 1) / 2);
  }
}
