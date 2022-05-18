package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036348 Parity of 'even number' and its sum of prime factors differs (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036348 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Jaguar.factor(mN).sopfr().isOdd()) {
        return Z.valueOf(mN);
      }
    }
  }
}
