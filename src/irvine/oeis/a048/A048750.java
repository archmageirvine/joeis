package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048750 Mean integral aliquot divisors associated with A048749.
 * @author Sean A. Irvine
 */
public class A048750 implements Sequence {

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
          return qr[0];
        }
      }
    }
  }
}
