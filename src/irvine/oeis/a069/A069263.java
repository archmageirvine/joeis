package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A266780.
 * @author Sean A. Irvine
 */
public class A069263 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM.z(++mN).pow(3).equals(Functions.DIGIT_SUM.z(Z.valueOf(mN).pow(3)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
