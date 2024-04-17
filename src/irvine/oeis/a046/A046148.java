package irvine.oeis.a046;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a014.A014553;
import irvine.util.Permutation;

/**
 * A046148 Number of n-digit numbers with maximal multiplicative persistence A014553.
 * @author Sean A. Irvine
 */
public class A046148 extends A014553 {

  // After Giovanni Resta

  private int mN = 0;

  @Override
  public Z next() {
    final long mxper = super.next().longValueExact() - 1;
    if (++mN == 1) {
      return Z.TEN;
    }
    Z sum = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(mN);
    int[] p;
    while ((p = part.next()) != null) {
      if (p.length <= 9) {
        // Promote partition up to 9 elements by zero filling
        final Permutation perm = new Permutation(Arrays.copyOf(p, 9));
        int[] q;
        while ((q = perm.next()) != null) {
          Z prod = Z.ONE;
          for (int k = 0; k < q.length; ++k) {
            prod = prod.multiply(Z.valueOf(k + 1).pow(q[k]));
          }
          if (Functions.DIGIT_PRODUCT_PERSISTENCE.l(prod) == mxper) {
            sum = sum.add(Binomial.multinomial(mN, p));
          }
        }
      }
    }
    return sum;
  }
}
