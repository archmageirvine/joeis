package irvine.oeis.a074;

import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074791 Numbers k such that k does not divide the denominator of the k-th harmonic number.
 * @author Sean A. Irvine
 */
public class A074791 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mH.nextQ().den().mod(++mN) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
