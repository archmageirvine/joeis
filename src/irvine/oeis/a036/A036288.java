package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a001.A001414;

/**
 * A036288 a(n) = 1 + integer log of n: if the prime factorization of n is n = Product (p_j^k_j) then a(n) = 1 + Sum (p_j * k_j) (cf. A001414).
 * @author Sean A. Irvine
 */
public class A036288 extends A001414 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

