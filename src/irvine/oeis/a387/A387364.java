package irvine.oeis.a387;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387364 allocated for Yaroslav Deryavko.
 * @author Sean A. Irvine
 */
public class A387364 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long k) {
    final Z[] p = Jaguar.factor(k).toZArray();
    if (p.length < 2) {
      return false;
    }
    final long r = p[0].mod(mN);
    for (int j = 1; j < p.length; ++j) {
      if (p[j].mod(mN) != r) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long k = mN;
    while (true) {
      if (is(++k)) {
        return Z.valueOf(k);
      }
    }
  }
}

