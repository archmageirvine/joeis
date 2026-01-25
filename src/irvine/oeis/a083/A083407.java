package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083407 Odd squares which can be expressed as the product of a number and its reversal in at least two different ways.
 * @author Sean A. Irvine
 */
public class A083407 extends Sequence1 {

  private long mN = 1113109;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z s = Z.valueOf(mN).square();
      if (A083406.is(s)) {
        return s;
      }
    }
  }
}
