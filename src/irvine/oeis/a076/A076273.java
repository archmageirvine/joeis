package irvine.oeis.a076;
// manually knestm/knest at 2023-03-02 19:24

import irvine.math.z.Z;
import irvine.oeis.a001.A001043;

/**
 * A076273 a(0) = 1, a(1) = 2; for n&gt;1, a(n) = prime(n)+prime(n-1)-1.
 * @author Georg Fischer
 */
public class A076273 extends A001043 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.valueOf(mN + 1) : super.next().subtract(1);
  }
}
