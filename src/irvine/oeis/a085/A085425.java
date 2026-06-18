package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085425 Number of minus ones in the symmetric signed digit expansion of n with q=2 (i.e., the representation of n in the (-1,0,1)_2 number system).
 * @author Sean A. Irvine
 */
public class A085425 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long r = 0; 1L << r < 3 * mN; ++r) {
      if (A085424.ep(r, mN) == -1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

