package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394626 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A394626 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n2 = Z.valueOf(++mN).square();
      for (final Z p : Jaguar.factor(n2.add(1)).toZArray()) {
        if (p.compareTo(mN) > 0 && p.compareTo(n2) < 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
