package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a035.A035250;

/**
 * A074814 Numbers k such that the number of primes between k and 2k (inclusive) is equal to the number of primes between k and reverse(k) (inclusive).
 * @author Sean A. Irvine
 */
public class A074814 extends Sequence1 {

  private final Sequence mA = new A035250();
  private final Sequence mB = new A074813();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().equals(mB.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
