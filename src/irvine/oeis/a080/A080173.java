package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000668;

/**
 * A080173 Final 2 digits of n-th Mersenne prime A000668(n).
 * @author Georg Fischer
 */
public class A080173 extends A000668 {

  private static final Z HUNDRED = Z.valueOf(100);

  @Override
  public Z next() {
    return super.next().mod(HUNDRED);
  }
}
