package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083041 Number of symmetric sum-free subsets of {1,2,...,n-1} with sums taken mod n.
 * @author Sean A. Irvine
 */
public class A083041 extends Sequence1 {

  // After Andrew Howroyd

  private int mN = 0;

  private boolean accept(final Z b, final int k) {
    for (int i = 1; i <= k; ++i) {
      if (b.testBit(i) && (b.testBit(k - i) || b.testBit(Math.min(k + i, mN - k - i)))) {
        return false;
      }
    }
    return true;
  }

  private Z recurse(final Z b, final int k) {
    if (2 * k > mN) {
      return Z.ONE;
    }
    final Z r = recurse(b, k + 1);
    final Z bk = b.setBit(k);
    return accept(bk, k) ? r.add(recurse(bk, k + 1)) : r;
  }

  @Override
  public Z next() {
    ++mN;
    return recurse(Z.ZERO, 1);
  }
}

