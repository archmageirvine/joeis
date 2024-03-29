package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A024011 Numbers k such that the k-th prime divides the sum of the first k primes.
 * @author Sean A. Irvine
 */
public class A024011 extends A000040 {

  protected Z mSum = Z.ZERO;
  protected Z mP;
  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
      mP = super.next();
      mSum = mSum.add(mP);
    } while (!mSum.mod(mP).isZero());
    return Z.valueOf(mN);
  }
}
