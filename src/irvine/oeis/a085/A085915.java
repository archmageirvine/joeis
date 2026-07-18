package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085915 Group the natural numbers such that the product of the terms of the n-th group is divisible by n!: (1), (2), (3, 4), (5, 6, 7, 8), (9, 10, 11, 12), (13, 14, 15, 16, 17, 18), (19, 20, 21, 22, 23, 24), ... Sequence contains the product of the terms of the n-th group divided by n!. a(n) = A085912(n)/(n!).
 * @author Sean A. Irvine
 */
public class A085915 extends Sequence1 {

  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    Z prod = Z.ONE;
    do {
      prod = prod.multiply(++mM);
    } while (!prod.mod(f).isZero());
    return prod.divide(f);
  }
}
