package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A075593 a(1) = 1, a(2n) = prime, a(2n+1) = composite and sum of two successive terms is alternately composite or prime.
 * @author Sean A. Irvine
 */
public class A075593 extends Sequence1 {

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
    final Sequence s = mEven ? new A000040() : new A002808();
    while (true) {
      final Z m = s.next();
      if (m.add(mA).isProbablePrime() != mEven && mUsed.add(m)) {
        mA = m;
        return m;
      }
    }
  }
}

