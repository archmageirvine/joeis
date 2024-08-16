package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054259 Squares having last digit equal to the sum of the other digits.
 * @author Sean A. Irvine
 */
public class A054259 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      final long sum = Functions.DIGIT_SUM.l(s);
      final long r = s.mod(10);
      if (sum - r == r) {
        return s;
      }
    }
  }
}

