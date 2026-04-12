package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a007.A007521;

/**
 * A392984 a(n) = (A_0 - A_2)/p where p is the n-th prime == 5 (mod 8) with p &gt;= 13, A_0 is the sum of quartic residues mod p, and A_2 is the sum of quadratic-non-quartic residues mod p.
 * @author Sean A. Irvine
 */
public class A392984 extends Sequence2 {

  private final Sequence mA = new A007521().skip();

  @Override
  public Z next() {
    final Z p = mA.next();
    final Z p1 = p.subtract(1);
    final Z e = p1.divide(4);
    Z s = Z.ZERO;
    for (Z k = Z.ONE; k.compareTo(p) < 0; k = k.add(1)) {
      final Z m = k.modPow(e, p);
      if (m.isOne()) {
        s = s.add(k);
      } else if (m.equals(p1)) {
        s = s.subtract(k);
      }
    }
    return s.divide(p);
  }
}
