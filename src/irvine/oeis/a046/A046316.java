package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046316 Numbers of the form p*q*r where p,q,r are (not necessarily distinct) odd primes.
 * @author Sean A. Irvine
 */
public class A046316 implements Sequence {

  private long mN = 25;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Jaguar.factor(mN).bigOmega() == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
