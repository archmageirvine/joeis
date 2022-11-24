package irvine.oeis.a118;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A118182 Antidiagonal sums of triangle A118180: a(n) = Sum_{k=0..[n/2]} (3^k)^(n-2*k) for n&gt;=0.
 * @author Georg Fischer
 */
public class A118182 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN / 2, k -> Z.THREE.pow(k * (mN - 2 * k)));
  }
}
