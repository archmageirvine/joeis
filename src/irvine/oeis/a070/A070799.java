package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070799 Numbers of the form 6jk-j-k.
 * @author Sean A. Irvine
 */
public class A070799 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      for (final Z d : Jaguar.factor(6 *  ++mN + 1).divisors()) {
        if (d.mod(6) == 5) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
