package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067745 Numerator of ((3*n - 2)/(n^(2*n - 1)*(2*n - 1)*4^(n - 1))).
 * @author Georg Fischer
 */
public class A067745 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long n32 = 3 * mN - 2;
    return Z.valueOf(n32 / Long.lowestOneBit(n32));
  }
}
