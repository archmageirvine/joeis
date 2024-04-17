package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046316 Numbers of the form p*q*r where p,q,r are (not necessarily distinct) odd primes.
 * @author Sean A. Irvine
 */
public class A046316 extends Sequence1 {

  private long mN = 25;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.BIG_OMEGA.l(mN) == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
