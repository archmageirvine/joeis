package irvine.oeis.a079;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerComposition;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079216 Square array A(n&gt;=0,k&gt;=1) (listed antidiagonally: A(0,1)=1, A(1,1)=1, A(0,2)=1, A(2,1)=2, A(1,2)=1, A(0,3)=1, A(3,1)=3, ...) giving the number of n-edge general plane trees fixed by k-fold application of Catalan Automorphisms A057511/A057512 (Deep rotation of general parenthesizations/plane trees).
 * @author Sean A. Irvine
 */
public class A079216 extends Sequence0 {

  private int mN = 0;
  private int mM = 0;

  private Z pFixedByA057511(final int n, final int k, final int r) {
    final int ncycles = Functions.GCD.i(r, k);
    final int cyclen = r / ncycles;
    Z sum = Z.ZERO;
    if (n % cyclen == 0) {
      final IntegerComposition comp = new IntegerComposition(n / cyclen, ncycles);
      int[] c;
      while ((c = comp.next()) != null) {
        Z prod = Z.ONE;
        for (final int i : c) {
          prod = prod.multiply(t(i - 1, IntegerUtils.lcm(r, k)));
        }
        sum = sum.add(prod);
      }
    }
    return sum;
  }

  protected Z t(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(1, n, r -> pFixedByA057511(n, k, r));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN - mM, mM);
  }
}
