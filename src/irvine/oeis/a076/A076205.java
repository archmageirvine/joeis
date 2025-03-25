package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076205 Numbers n such that 30*n+{1,7,11,13,17,19,23,29} are all composite.
 * @author Sean A. Irvine
 */
public class A076205 extends Sequence1 {

  private static final long[] ADDENDS = {1, 7, 11, 13, 17, 19, 23, 29};
  private static final Z Z30 = Z.valueOf(30);
  private long mN = 359;

  private boolean is(final Z t) {
    for (final long a : ADDENDS) {
      if (t.add(a).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = Z30.multiply(++mN);
      if (is(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
