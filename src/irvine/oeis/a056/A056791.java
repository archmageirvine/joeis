package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056791 Weight of binary expansion of n + length of binary expansion of n.
 * @author Sean A. Irvine
 */
public class A056791 extends Sequence0 {

  private long mN = -1;
  
  @Override
  public Z next() {
    return Z.valueOf(Long.bitCount(++mN) + LongUtils.log2(mN) + 1);
  }
}
