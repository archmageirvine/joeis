package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004394;

/**
 * A073349 Numbers m such that sigma(m)/m is equal to sigma(k)/k for some k being superabundant (A004394).
 * @author Sean A. Irvine
 */
public class A073349 extends Sequence1 {

  private final DirectSequence mSuperAbundant = DirectSequence.create(new A004394());
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = Functions.SIGMA1.z(mN);
      int k = -1;
      while (true) {
        final Z t = mSuperAbundant.a(++k);
        if (t.compareTo(mN) > 0) {
          break;
        }
        if (s.multiply(t).equals(Functions.SIGMA1.z(t).multiply(mN))) {
          return mN;
        }
      }
    }
  }
}

