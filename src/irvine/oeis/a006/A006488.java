package irvine.oeis.a006;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A006488 Numbers n such that n! has a square number of digits.
 * @author Sean A. Irvine
 */
public class A006488 extends Sequence1 {

  private final Sequence mF = new A000142();
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int len = mF.next().toString().length();
      final int s = IntegerUtils.sqrt(len);
      if (s * s == len) {
        return Z.valueOf(mN);
      }
    }
  }
}

