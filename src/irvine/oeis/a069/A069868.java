package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069868 Smallest n-th power whose digit reversal is a prime.
 * @author Sean A. Irvine
 */
public class A069868 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN);
      if (Functions.REVERSE.z(t).isProbablePrime()) {
        return t;
      }
    }
  }
}

