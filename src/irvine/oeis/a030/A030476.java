package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030476 Squares with property that all even digits occur together and all odd digits occur together.
 * @author Sean A. Irvine
 */
public class A030476 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z square = mN.square();
      if (!A030475.isMixed(square)) {
        return square;
      }
    }
  }
}
