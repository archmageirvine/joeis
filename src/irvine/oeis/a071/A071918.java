package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;
import irvine.oeis.a001.A001113;

/**
 * A071918 First appearance in the decimal expansion of Pi of the first n digits of the decimal expansion of e.
 * @author Sean A. Irvine
 */
public class A071918 extends Sequence1 {

  private final DirectSequence mPi = DirectSequence.create(new A000796());
  private final DirectSequence mE = DirectSequence.create(new A001113());
  private int mN = 0;

  private boolean isMatch(final int pos, final int n) {
    for (int k = 0; k < n; ++k) {
      if (!mE.a(k).equals(mPi.a(pos + k))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    int pos = 0;
    while (!isMatch(++pos, mN)) {
      // do nothing
    }
    return Z.valueOf(pos);
  }
}
