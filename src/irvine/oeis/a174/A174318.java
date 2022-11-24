package irvine.oeis.a174;

import irvine.math.z.Z;
import irvine.oeis.a000.A000166;

/**
 * A174318 a(n) = ceiling(n!/e) with e = A001113 = exp(1).
 * @author Georg Fischer
 */
public class A174318 extends A000166 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(2n) = A000166(2n). a(2n+1) = A000166(2n+1)+1.
    ++mN;
    return super.next().add(((mN & 1) == 0) ? 0 : 1);
  }
}
