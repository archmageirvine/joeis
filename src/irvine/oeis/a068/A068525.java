package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a001.A001359;

/**
 * A068525 Smallest k-almost prime between twin primes (for k &gt;= 2).
 * @author Sean A. Irvine
 */
public class A068525 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Sequence lesser = new A001359();
    while (true) {
      final Z t = lesser.next().add(1);
      if (Jaguar.factor(t).bigOmega() == mN) {
        return t;
      }
    }
  }
}

