package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066207.
 * @author Sean A. Irvine
 */
public class A066207 extends Sequence1 {

  private long mN = -1;

  private boolean is(final long n) {
    if (n % 5 == 0 || n % 11 == 0) {
      return false; // Efficiency, avoid factoring in many cases
    }
    for (final Z p : Jaguar.factor(n).toZArray()) {
      if ((Puma.primePi(p) & 1) == 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
