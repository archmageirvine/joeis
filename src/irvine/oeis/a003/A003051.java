package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A003051 Number of inequivalent sublattices of index n in hexagonal lattice, where two sublattices are equivalent if they are related by a rotation or reflection preserving the hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A003051 extends Sequence1 {

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
