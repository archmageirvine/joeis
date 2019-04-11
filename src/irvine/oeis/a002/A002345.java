package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a033.A033207;

/**
 * A002345 Numbers y such that p <code>= x^2 +</code> 7y^2, with prime p = A033207(n).
 * @author Sean A. Irvine
 */
public class A002345 extends A033207 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z y = Z.ZERO;
    while (true) {
      y = y.add(1);
      final Z x2 = p.subtract(y.square().multiply(7));
      final Z[] s = x2.sqrtAndRemainder();
      if (Z.ZERO.equals(s[1])) {
        return y;
      }
    }
  }
}
