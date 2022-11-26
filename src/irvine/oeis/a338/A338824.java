package irvine.oeis.a338;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A338824 Lexicographically earliest sequence of nonnegative integers such that for any distinct m and n, a(m) OR a(m+1) &lt;&gt; a(n) OR a(n+1) (where OR denotes the bitwise OR operator).
 * @author Georg Fischer
 */
public class A338824 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(2*n) = 2*n-2 for any n > 0; a(4*n+1) = 0 for any n >= 0; a(4*n+3) = 1 for any n >= 0.
    ++mN;
    if ((mN & 1) == 0) {
      return Z.valueOf(mN - 2);
    }
    return ((mN & 3) == 1) ? Z.ZERO : Z.ONE;
  }
}
