package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006601 Numbers n such that n, <code>n+1, n+2</code> and <code>n+3</code> have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A006601 implements Sequence {

  private long mN = 241;
  private long mB = 6;
  private long mC = 6;
  private long mD = 6;

  @Override
  public Z next() {
    while (true) {
      final long a = mB;
      mB = mC;
      mC = mD;
      mD = Cheetah.factor(++mN + 3).sigma0AsLong();
      if (a == mD && mB == mD && mC == mD) {
        return Z.valueOf(mN);
      }
    }
  }
}

