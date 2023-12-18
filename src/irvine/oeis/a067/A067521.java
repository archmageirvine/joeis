package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A067521 Numbers n such that the square root of n is an integer and a multiple of the sum of the digits of n.
 * @author Sean A. Irvine
 */
public class A067521 extends Sequence1 {

  private final Sequence mSquares = new A000290().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mSquares.next();
      final long s = ZUtils.digitSum(t);
      if (++mN % s == 0) {
        return t;
      }
    }
  }
}

