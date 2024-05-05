package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069562 extends Sequence1 {

  private Z mN = Z.EIGHT;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.makeOdd();
      if (t.compareTo(Z.ONE) > 0 && t.isSquare()) {
        return mN;
      }
    }
  }
}
