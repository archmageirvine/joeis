package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a134.A134808;

/**
 * A239589 Numbers whose squares are cyclops numbers.
 * @author Georg Fischer
 */
public class A239589 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (A134808.isCyclops(mN.square())) {
        return mN;
      }
    }
  }
}
