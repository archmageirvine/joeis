package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071638 Numbers n such that phi(n) = b(n,1)^b(n,0) where b(n,1) is the number of 1's in binary representation of n and b(n,0) the number of 0's.
 * @author Sean A. Irvine
 */
public class A071638 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long pop = Long.bitCount(++mN);
      if (Functions.PHI.z(mN).equals(Z.valueOf(pop).pow(Functions.DIGIT_LENGTH.l(2, mN) - pop))) {
        return Z.valueOf(mN);
      }
    }
  }
}
