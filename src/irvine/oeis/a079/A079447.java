package irvine.oeis.a079;

import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079447 Primes p such that there is an integer k satisfying p = floor(k*H(k)) where H(k) denotes the k-th harmonic number (i.e., H(k) = 1 + 1/2 + 1/3 + ... + 1/k).
 * @author Sean A. Irvine
 */
public class A079447 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mH.nextQ().multiply(++mN).floor();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
