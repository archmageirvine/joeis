package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038712 Let k be the exponent of highest power of 2 dividing n (A007814); a(n) = 2^(k+1)-1.
 * @author Sean A. Irvine
 */
public class A038712 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN ^ ++mN);
  }
}
