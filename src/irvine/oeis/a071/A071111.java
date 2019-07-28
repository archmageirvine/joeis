package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A071111 <code>a(n)</code> is the least integer x such that there exists an integer in the open interval <code>(x/(i+1), x/i)</code> for <code>i= n-1, n-2</code> ..., <code>3, 2, 1</code>.
 * @author Sean A. Irvine
 */
public class A071111 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  private boolean check() {
    for (long r = 2; r <= mN; ++r) {
      final long k = mM / r + 1;
      for (long s = 1; s < r; ++s) {
        // (1/r) < (1/s), (mM / r) < (mM / s)
        // Test if there is an integer k between
        if (s * k >= mM) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (check()) {
        return Z.valueOf(mM);
      }
      ++mM;
    }
  }
}
