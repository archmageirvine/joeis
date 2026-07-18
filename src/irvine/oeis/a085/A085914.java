package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085914 Group the natural numbers so that the product of the terms of the n-th group is divisible by n!: (1),(2),(3,4),(5,6,7,8),(9,10,11,12),(13,14,15,16,17,18),(19,20,21,22,23,24),... Sequence contains the number of terms in each group.
 * @author Sean A. Irvine
 */
public class A085914 extends Sequence1 {

  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    Z prod = Z.ONE;
    long k = 0;
    do {
      ++k;
      prod = prod.modMultiply(++mM, f);
    } while (!prod.isZero());
    return Z.valueOf(k);
  }
}
