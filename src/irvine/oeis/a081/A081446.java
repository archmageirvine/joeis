package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081446 a(n) = sqrt( A081445(n) )/6.
 * @author Sean A. Irvine
 */
public class A081446 extends Sequence1 {

  private Z mSum = Z.valueOf(11);

  @Override
  public Z next() {
    long k = 0;
    while (true) {
      final Z t = Z.valueOf(6 * ++k).square();
      final Z s = mSum.add(t);
      if (s.isProbablePrime()) {
        mSum = s;
        return Z.valueOf(k);
      }
    }
  }
}
