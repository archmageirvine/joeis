package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054904 x = a(n) is the smallest composite number such that sigma(x+6n) = sigma(x)+6n, where sigma = A000203.
 * @author Sean A. Irvine
 */
public class A054904 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 6;
    long c = 3;
    while (true) {
      if (Functions.SIGMA1.z(++c).add(mN).equals(Functions.SIGMA1.z(c + mN))) {
        final Z a = Z.valueOf(c);
        if (!a.isProbablePrime()) {
          return a;
        }
      }
    }
  }
}
