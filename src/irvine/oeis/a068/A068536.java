package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A068536 Numbers m such that m^2 + (reversal of m)^2 is a square. (Leading 0's are ignored.).
 * @author Sean A. Irvine
 */
public class A068536 extends Sequence1 {

  private long mN = 88208;

  @Override
  public Z next() {
    while (true) {
      final Z a = Z.valueOf(++mN);
      if (a.square().add(ZUtils.reverse(a).square()).isSquare()) {
        return a;
      }
    }
  }
}

