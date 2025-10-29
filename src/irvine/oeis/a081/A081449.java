package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081418.
 * @author Sean A. Irvine
 */
public class A081449 extends Sequence1 {

  private Z mSum = Z.valueOf(17);

  @Override
  public Z next() {
    long k = 0;
    while (true) {
      final Z t = Z.valueOf(6 * ++k).square();
      final Z s = mSum.add(t);
      if (s.isProbablePrime()) {
        mSum = s;
        return t;
      }
    }
  }
}
