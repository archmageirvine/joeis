package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003849;

/**
 * A394649 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A394649 extends Sequence0 {

  private final DirectSequence mA = DirectSequence.create(new A003849());
  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return mA.a(n).add(mA.a(n + m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

