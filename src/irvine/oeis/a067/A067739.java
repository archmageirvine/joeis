package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067739 Integers x such that for some integer y we have uphi(x) = uphi(y) = x-y, where uphi(n) = A047994(n) is the unitary totient function: If n = Product p_i^e_i, uphi(n) = Product (p_i^e_i - 1).
 * @author Sean A. Irvine
 */
public class A067739 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z u = Jaguar.factor(++mN).unitaryPhi();
      if (Jaguar.factor(mN - u.longValueExact()).unitaryPhi().equals(u)) {
        return Z.valueOf(mN);
      }
    }
  }
}
