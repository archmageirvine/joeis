package irvine.oeis.a118;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A118187 Antidiagonal sums of triangle A118185: a(n) = Sum_{k=0..[n/2]} 4^(k*(n-2*k)) for n&gt;=0.
 * @author Georg Fischer
 */
public class A118187 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN / 2, k -> Z.FOUR.pow(k * (mN - 2L * k)));
  }
}
