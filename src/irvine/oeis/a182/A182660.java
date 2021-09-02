package irvine.oeis.a182;
// manually 2021-09-02

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A182660 a(2^(k+1)) = k; 0 everywhere else. 
 * @author Georg Fischer
 */
public class A182660 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN <= 3) {
      return Z.ZERO;
    }
    return Long.bitCount(mN) == 1 ? Z.valueOf(Long.numberOfTrailingZeros(mN) - 1) : Z.ZERO;
  }
}
