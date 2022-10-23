package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048749 Factor n, divide sum of aliquot divisors by number of aliquot divisors; append n to sequence if quotient is integral and not previously seen.
 * @author Sean A. Irvine
 */
public class A048749 extends Sequence1 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s0 = fs.sigma0();
      if (!Z.TWO.equals(s0)) { // i.e. mN is composite
        final Z[] qr = fs.sigma().subtract(mN).divideAndRemainder(s0.subtract(1));
        if (qr[1].isZero() && mSeen.add(qr[0])) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
