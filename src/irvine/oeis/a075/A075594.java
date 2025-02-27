package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A075594 a(1) = 1, a(2n) = composite, a(2n+1) = prime and sum of two successive terms is alternately prime or composite.
 * @author Sean A. Irvine
 */
public class A075594 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;
  private boolean mEven = true;

  @Override
  public Z next() {
    mEven = !mEven;
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Sequence s = mEven ? new A002808() : new A000040();
    while (true) {
      final Z m = s.next();
      if (m.add(mA).isProbablePrime() == mEven && mUsed.add(m)) {
        mA = m;
        return m;
      }
    }
  }
}

