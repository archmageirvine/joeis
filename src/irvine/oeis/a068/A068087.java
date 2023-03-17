package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068087 a(n) = n^(2*n-2).
 * @author Georg Fischer
 */
public class A068087 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(2 * mN - 2);
  }
}
