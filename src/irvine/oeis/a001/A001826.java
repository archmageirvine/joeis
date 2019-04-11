package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001826 Number of divisors of n of form <code>4k+1</code>.
 * @author Sean A. Irvine
 */
public class A001826 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long r = 0;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (d.mod(4) == 1) {
        ++r;
      }
    }
    return Z.valueOf(r);
  }
}
