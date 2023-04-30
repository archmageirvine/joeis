package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a134.A134808;

/**
 * A239591 Numbers whose fourth powers are cyclops numbers.
 * @author Georg Fischer
 */
public class A239591 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (A134808.isCyclops(mN.pow(4))) {
        return mN;
      }
    }
  }
}
