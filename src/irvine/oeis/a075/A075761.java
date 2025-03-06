package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075761 Numbers n such that there are at least 3 integers k from the set {2,3,4,5,6,7,8,9} such that the digital sum of each base k representation of n equals k.
 * @author Sean A. Irvine
 */
public class A075761 extends Sequence1 {

  private long mN = 12;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int cnt = 0;
      for (int base = 2; base < 10; ++base) {
        if (Functions.DIGIT_SUM.i(base, mN) == base && ++cnt >= 3) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
