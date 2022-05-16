package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046337 Odd numbers with an even number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046337 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if ((Jaguar.factor(mN).bigOmega() & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
