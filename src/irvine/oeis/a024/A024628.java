package irvine.oeis.a024;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024628 Odd numbers k such that neither k nor k <code>+ 2</code> is a power of a prime.
 * @author Sean A. Irvine
 */
public class A024628 implements Sequence {

  private long mN = 31;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Cheetah.factor(mN).omega() != 1 && Cheetah.factor(mN + 2).omega() != 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
