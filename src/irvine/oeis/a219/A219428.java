package irvine.oeis.a219;

import irvine.math.z.Z;
import irvine.oeis.a016.A016035;

/**
 * A219428 a(n) = n - 1 - phi(n).
 * Apart from the first term, the same as A016035.
 * @author Georg Fischer
 */
public class A219428 extends A016035 {

  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? super.next().subtract(1) : super.next();
  }
}
