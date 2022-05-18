package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001826 Number of divisors of n of the form 4k+1.
 * @author Sean A. Irvine
 */
public class A001826 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long r = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.mod(4) == 1) {
        ++r;
      }
    }
    return Z.valueOf(r);
  }
}
