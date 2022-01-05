package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053628 Smallest integer which is the harmonic mean of A005279(n) and an integer.
 * @author Sean A. Irvine
 */
public class A053628 implements Sequence {

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
        return Z.valueOf((2 * mN * k) / (mN + k));
      }
    }
  }
}

