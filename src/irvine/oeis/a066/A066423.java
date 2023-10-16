package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066423 Composite numbers n such that the product of proper divisors of the n does not equal n.
 * @author Sean A. Irvine
 */
public class A066423 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z d = Jaguar.factor(++mN).sigma0();
      if (d.equals(Z.THREE) || d.compareTo(Z.FOUR) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
