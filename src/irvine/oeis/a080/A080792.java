package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080792 Numbers which when seen in a mirror are different numbers.
 * @author Sean A. Irvine
 */
public class A080792 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final int syn = Functions.SYNDROME.i(++mN);
      if ((syn & 0b1011011000) == 0 && (mN % 10 == 0 || Long.parseLong(Functions.REVERSE.z(mN).toString().replace('2', 'x').replace('5', '2').replace('x', '5')) != mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
