package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383239 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A383239 extends Sequence1 {

  private long mN = 1739;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z n = Z.valueOf(mN);
      final Z s = Functions.SIGMA1.z(mN);
      for (final Z k : InverseSigma.inverseSigma(s, 1)) {
        if (k.compareTo(n) < 0 && s.equals(k.add(2 * mN))) {
          return n;
        }
      }
    }
  }
}

