package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057301 Binary counter with bit positions permuted in increasing length cycles: 0;2,1;5,3,4;9,6,7,8,...
 * @author Sean A. Irvine
 */
public class A057301 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long res = 0;
    long mask = 0;
    int bitsInBlock = 0;
    int shift = 0;
    while (m != 0) {
      ++bitsInBlock;
      mask <<= 1;
      mask |= 1;
      final long sub = m & mask;
      final long rotate = ((sub & 1) << (bitsInBlock - 1)) | (sub >>> 1);
      res += rotate << shift;
      shift += bitsInBlock;
      m >>>= bitsInBlock;
    }
    return Z.valueOf(res);
  }
}
