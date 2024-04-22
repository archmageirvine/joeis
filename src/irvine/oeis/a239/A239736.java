package irvine.oeis.a239;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A239736 Least k &gt; 0 such that p(n)+p(k)-1 is prime, where p(n) is the number of partitions of n.
 * @author Sean A. Irvine
 */
public class A239736 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    final int index1 = ++mN;
    final Z pn = Functions.PARTITIONS.z(index1);
    int k = 0;
    while (true) {
      final int index = ++k;
      if (pn.add(Functions.PARTITIONS.z(index)).subtract(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
