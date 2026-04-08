package irvine.oeis.a084;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084362 a(n) = Sum{j_1 + ... + j_n = n} Sum_{k=1..n} k*C(n-1,k-1), where the outer sum is over all partitions of n.
 * @author Sean A. Irvine
 */
public class A084362 extends Sequence1 {

  // a(n) = Sum{j_1 + ... + j_n = n} Sum_{k=1..n} k*C(n-1,k-1), where the outer sum is over all partitions of n.
  // todo huh? inner sum doesn't depend on the partition

  private int mN = 0;

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    Z sum = Z.ZERO;
    int[] p;
    while ((p = part.next()) != null) {
      for (int k = 0; k < p.length; ++k) {
        sum = sum.add(Binomial.binomial(mN - 1, p[k]).multiply(k + 1));
      }
    }
    return sum;
  }
}
