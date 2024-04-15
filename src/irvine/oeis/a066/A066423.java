package irvine.oeis.a066;

import irvine.math.function.Functions;
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
      final Z d = Functions.SIGMA0.z(++mN);
      if (d.equals(Z.THREE) || d.compareTo(Z.FOUR) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
