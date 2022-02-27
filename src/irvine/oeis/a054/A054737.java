package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054737 Numbers n such that n^2 can be split into two nonzero squares (perhaps with leading zeros) in exactly two different ways.
 * @author Sean A. Irvine
 */
public class A054737 implements Sequence {

  private Z mN = Z.valueOf(252);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.square().toString();
      int cnt = 0;
      for (int k = 1; k < s.length(); ++k) {
        final Z t = new Z(s.substring(k));
        if (!t.isZero() && t.isSquare() && new Z(s.substring(0, k)).isSquare() && ++cnt > 2) {
          break;
        }
      }
      if (cnt == 2) {
        return mN;
      }
    }
  }
}
