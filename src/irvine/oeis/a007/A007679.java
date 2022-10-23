package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007679 If n mod 4 = 0 then 2^(n-1)+1 elif n mod 4 = 2 then 2^(n-1)-1 else 2^(n-1).
 * @author Sean A. Irvine
 */
public class A007679 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN).add((1 - (++mN & 1)) * (1 - (mN & 2)));
  }
}
