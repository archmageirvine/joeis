package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053629 Smallest integer where the harmonic mean of a(n) and A005279(n) is an integer.
 * @author Sean A. Irvine
 */
public class A053629 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long k = 1;
      while ((2 * mN * k) % (mN + k) != 0) {
        ++k;
      }
      if (k != mN) {
        return Z.valueOf(k);
      }
    }
  }
}

