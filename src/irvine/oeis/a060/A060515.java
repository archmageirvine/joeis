package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060515 Integers i &gt; 1 for which there is no prime p such that i is a solution mod p of x^2 = 2.
 * @author Sean A. Irvine
 */
public class A060515 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GPF.l(++mN * mN - 2) <= mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
