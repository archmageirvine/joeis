package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066194 A permutation of the integers (a fractal sequence): a(n) = A006068(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A066194 extends Sequence1 {

  // After Chai Wah Wu

  private long mN = -1;

  @Override
  public Z next() {
    long k = ++mN;
    long m = k >>> 1;
    while (m > 0) {
      k ^= m;
      m >>>= 1;
    }
    return Z.valueOf(k + 1);
  }
}
