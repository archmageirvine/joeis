package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065882 Ultimate modulo 4: right-hand nonzero digit of n when written in base 4.
 * @author Sean A. Irvine
 */
public class A065882 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while ((m & 3) == 0) {
      m >>>= 2;
    }
    return Z.valueOf(m & 3);
  }
}
