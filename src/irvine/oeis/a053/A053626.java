package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053626 a(n) is the smallest positive integer k such that harmonic mean of n and k is an integer.
 * @author Sean A. Irvine
 */
public class A053626 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while ((2 * mN * k) % (mN + k) != 0) {
      ++k;
    }
    return Z.valueOf(k);
  }
}

