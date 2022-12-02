package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.a005.A005259;

/**
 * A289277 a(n) = A005259(n) mod 2*n+1.
 * @author Georg Fischer
 */
public class A289277 extends A005259 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.next().mod(Z.valueOf(2 * mN + 1));
  }
}
