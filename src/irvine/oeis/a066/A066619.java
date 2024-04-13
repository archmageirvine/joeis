package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066619 Both n and its reverse are one less than a square.
 * @author Sean A. Irvine
 */
public class A066619 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().subtract(1);
      if (t.isZero() || (t.mod(10) != 0 && Functions.REVERSE.z(t).add(1).isSquare())) {
        return t;
      }
    }
  }
}
