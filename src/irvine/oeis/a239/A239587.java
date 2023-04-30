package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a134.A134808;

/**
 * A239587 Cubes that are cyclops numbers.
 * @author Georg Fischer
 */
public class A239587 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z result = mN.pow(3);
      if (A134808.isCyclops(result)) {
        return result;
      }
    }
  }
}
