package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053627 Smallest integer which is the harmonic mean of n and an integer.
 * @author Sean A. Irvine
 */
public class A053627 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while ((2 * mN * k) % (mN + k) != 0) {
      ++k;
    }
    return Z.valueOf(2 * mN * k / (mN + k));
  }
}

