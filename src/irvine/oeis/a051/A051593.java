package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000793;

/**
 * A051593 Largest order of even permutation of n elements, or maximal order of element of alternating group <code>A_n</code>.
 * @author Sean A. Irvine
 */
public class A051593 extends A051704 {

  private int mN = -1;
  private Z mPrev = null;
  private final A000793 mA793 = new A000793();

  @Override
  public Z next() {
    if (++mN < 2) {
      mPrev = super.next();
      return Z.ONE;
    }
    final Z t = super.next();
    final Z r = t.max(mPrev).max(mA793.next());
    mPrev = t;
    return r;
  }
}
