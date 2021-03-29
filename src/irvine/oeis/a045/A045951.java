package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045951.
 * @author Sean A. Irvine
 */
public class A045951 implements Sequence {

  // Actually it seems you have to pretend that "1" is included in each
  // set -- this is not quite the same thing as saying that empty set
  // has product 1, otherwise {}+{1}={2} and {}+{}={1,2} and a(2)=2.

  private long mN = 0;
  private long mC = 0;

  // Only keep track of the products are we proceed
  private void search(final long a, final long b, final long c, final long k) {
    if (k > mN) {
      if (a + b == c) {
        ++mC;
      }
      return;
    }
    // Place k in one of the three sets
    search(a * k, b, c, k + 1);
    if (a != 1) { // break symmetry, a+b == b+a
      search(a, b * k, c, k + 1);
    }
    search(a, b, c * k, k + 1);
  }

  @Override
  public Z next() {
    ++mN;
    mC = 0;
    search(1, 1, 1, 2);
    return Z.valueOf(mC);
  }
}
