package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046470 Even numbers with an odd number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046470 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if ((Jaguar.factor(mN).bigOmega() & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
