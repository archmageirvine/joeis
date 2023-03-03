package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a037.A037445;

/**
 * A064547 Sum of binary digits (or count of 1-bits) in the exponents of the prime factorization of n.
 * @author Georg Fischer
 */
public class A064547 extends A037445 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength() - 1);
  }
}
