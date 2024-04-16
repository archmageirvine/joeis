package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061090 Squares the sum of the squares of whose digits are squares.
 * @author Sean A. Irvine
 */
public class A061090 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square();
      final long ss = Functions.DIGIT_SUM_SQUARES.l(t);
      final long s = LongUtils.sqrt(ss);
      if (s * s == ss) {
        return t;
      }
    }
  }
}
