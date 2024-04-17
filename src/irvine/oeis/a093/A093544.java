package irvine.oeis.a093;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000265;

/**
 * A093544 Numerator of (4n-3)/A000265(n). Numerator of pairwise quotients of A004130.
 * @author Georg Fischer
 */
public class A093544 extends A000265 {

  private int mN;

  /** Construct the sequence. */
  public A093544() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return new Q(4L * mN - 3, super.next()).num();
  }
}
