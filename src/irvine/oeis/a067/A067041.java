package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A067041 a(n) = n^(product of digits of n).
 * @author Georg Fischer
 */
public class A067041 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return Z.valueOf(mN).pow(ZUtils.digitProduct(mN));
  }
}
