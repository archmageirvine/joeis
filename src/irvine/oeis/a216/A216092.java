package irvine.oeis.a216;

import irvine.math.z.Z;
import irvine.oeis.a007.A007185;

/**
 * A216092 a(n) = 2^(2*5^(n-1)) mod 10^n.
 * @author Georg Fischer
 */
public class A216092 extends A007185 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
