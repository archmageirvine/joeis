package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a002.A002034;

/**
 * A073535 Numbers k such that S(k+2) = d(k)+2, where S(k) is the Kempner function (A002034) and d(k) is the number of divisors of k (A000005).
 * @author Sean A. Irvine
 */
public class A073535 extends A000005 {

  private final Sequence mKempner = new A002034().skip(2);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().add(2).equals(mKempner.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
