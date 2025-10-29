package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081418.
 * @author Sean A. Irvine
 */
public class A081451 extends Sequence1 {

  private Z mSum = Z.valueOf(11);
  private long mM = 2;

  @Override
  public Z next() {
    while (true) {
      long k = 0;
      while (true) {
        final Z t = Z.valueOf(6 * ++k).square();
        final Z s = mSum.add(t);
        if (s.isProbablePrime()) {
          mSum = s;
          break;
        }
      }
      if (k > mM) {
        mM = k;
        return Z.valueOf(k);
      }
    }
  }
}
