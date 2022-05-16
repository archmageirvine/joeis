package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048747 Factor composite n, divide sum of divisors by number of divisors; append n to sequence if quotient is integral and not previously seen.
 * @author Sean A. Irvine
 */
public class A048747 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s0 = fs.sigma0();
      if (!Z.TWO.equals(s0)) { // i.e. mN is composite
        final Z[] qr = fs.sigma().divideAndRemainder(s0);
        if (qr[1].isZero() && mSeen.add(qr[0])) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
