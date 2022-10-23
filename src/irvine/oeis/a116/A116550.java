package irvine.oeis.a116;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a165.A165430;

/**
 * A116550 The bi-unitary analog of Euler's totient function of n.
 * @author Sean A. Irvine
 */
public class A116550 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long cnt = 0;
    for (long k = 1; k < mN; ++k) {
      if (A165430.gcud(k, mN) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
