package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051772 Distended numbers.
 * @author Sean A. Irvine
 */
public class A051772 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    outer:
    while (true) {
      Z sum = Z.ZERO;
      for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
        if (sum.compareTo(d) >= 0) {
          continue outer;
        }
        sum = sum.add(d);
      }
      return Z.valueOf(mN);
    }
  }
}
