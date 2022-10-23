package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001793 a(n) = n*(n+3)*2^(n-3).
 * @author Sean A. Irvine
 */
public class A001793 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 3).shiftLeft(mN - 3);
  }
}
