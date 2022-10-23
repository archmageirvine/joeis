package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056041 Value for which b(a(n))=0 when b(2)=n and b(k+1) is calculated by writing b(k) in base k, reading this as being written in base k+1 and then subtracting 1.
 * @author Sean A. Irvine
 */
public class A056041 extends Sequence0 {

  private static final long[] SMALL = {2, 3, 5, 7, 23, 63, 383, 2047};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[mN]);
    }
    if (mN == SMALL.length) {
      // 3*2^(3*2^27+27)-1
      return Z.THREE.shiftLeft(3 * (1 << 27) + 27).subtract(1);
    }
    // Next term not representable by Z
    throw new UnsupportedOperationException();
  }
}
