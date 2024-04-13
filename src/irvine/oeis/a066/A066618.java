package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066618 Both m and its reverse are one more than a square and m does not end in 0.
 * @author Sean A. Irvine
 */
public class A066618 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().add(1);
      if (t.mod(10) != 0 && Functions.REVERSE.z(t).subtract(1).isSquare()) {
        return t;
      }
    }
  }
}
