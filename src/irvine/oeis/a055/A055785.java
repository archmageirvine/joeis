package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A055785 a(n) = smallest prime q of form q=-1+(p+1)*10^w, where p is n-th prime.
 * @author Sean A. Irvine
 */
public class A055785 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next().add(1);
    if (Z.FOUR.equals(p)) {
      return Z.ZERO;
    }
    while (true) {
      p = p.multiply(10);
      final Z q = p.subtract(1);
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}
