package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392946 Odd numbers that divide 2^m + 1 for some odd m.
 * @author Sean A. Irvine
 */
public class A392946 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if ((Functions.ORDER.l(mN, mN - 2) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
