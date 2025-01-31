package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002034;
import irvine.oeis.a060.A060681;

/**
 * A074845 Numbers k such that S(k) = largest difference between consecutive divisors of k (ordered by size), where S(k) is the Kempner function (A002034).
 * @author Sean A. Irvine
 */
public class A074845 extends Sequence1 {

  private final Sequence mA = new A060681();
  private final Sequence mB = new A002034();
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
