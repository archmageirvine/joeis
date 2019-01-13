package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * A003051.
 * @author Sean A. Irvine
 */
public class A003051 implements Sequence {

  private final Sequence mBSeq = new A003050();
  private final List<Z> mB = new ArrayList<>();
  {
    mB.add(null); // no 0th term
  }
  private int mN = 0;

  private Z b(final int n) {
    while (n >= mB.size()) {
      mB.add(mBSeq.next());
    }
    return mB.get(n);
  }

  @Override
  public Z next() {
    Z s = Z.ZERO;
    ++mN;
    for (int k = 1, l; (l = k * k) <= mN; ++k) {
      if (mN % l == 0) {
        s = s.add(b(mN / l));
      }
    }
    return s;
  }
}
