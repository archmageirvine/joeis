package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053094 Primes found after n iterations in A053093.
 * @author Sean A. Irvine
 */
public class A053094 extends Sequence1 {

  private int mN = 0;
  private Z mM = Z.SEVEN;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      mM = mM.add(1);
      if (!mM.isProbablePrime()) {
        Z t = mM;
        int k = 0;
        do {
          if (++k > mN) {
            break;
          }
          t = t.subtract(Functions.SOPFR.z(t));
        } while (!t.isProbablePrime());
        if (k == mN) {
          return t;
        }
      }
    }
  }
}
