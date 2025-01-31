package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014085;

/**
 * A074817 Numbers n such that the number of primes between n^2 and (n+1)^2 = the number of primes between n and Reverse(n) (inclusive).
 * @author Sean A. Irvine
 */
public class A074817 extends Sequence1 {

  private final Sequence mA = new A014085().skip();
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
