package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054904 x = a(n) is the smallest composite number such that sigma(x+6n) = sigma(x)+6n, where sigma = A000203.
 * @author Sean A. Irvine
 */
public class A054904 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 6;
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
