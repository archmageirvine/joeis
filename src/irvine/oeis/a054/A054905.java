package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054905 Smallest composite x such that sigma(x) + 2n = sigma(x + 2n).
 * @author Sean A. Irvine
 */
public class A054905 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long c = 3;
    while (true) {
      if (Cheetah.factor(++c).sigma().add(mN).equals(Cheetah.factor(c + mN).sigma())) {
        final Z a = Z.valueOf(c);
        if (!a.isProbablePrime()) {
          return a;
        }
      }
    }
  }
}
