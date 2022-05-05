package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056671 1 + the number of unitary and squarefree divisors of n = number of divisors of reduced squarefree part of n.
 * @author Sean A. Irvine
 */
public class A056671 extends A056169 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValueExact());
  }
}
