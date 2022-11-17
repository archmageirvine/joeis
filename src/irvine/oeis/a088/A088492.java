package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.a005.A005185;

/**
 * A088492 a(2n+1)=2n+1, a(2n) = floor(2*n/A005185(n)), a weighted inverse of Hofstadter&apos;s Q-sequence.
 * @author Georg Fischer
 */
public class A088492 extends A005185 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? Z.valueOf(mN) : Z.valueOf(mN).divide(super.next());
  }
}
