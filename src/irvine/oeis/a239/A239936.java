package irvine.oeis.a239;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A239936 Least <code>k &gt; 0</code> such that p(k)+q(n) is prime, where p(n) is the number of partitions of n and q(n) is the number of strict partitions of n.
 * @author Sean A. Irvine
 */
public class A239936 extends A000009 {

  @Override
  public Z next() {
    final Z pn = super.next();
    int k = 0;
    while (true) {
      if (pn.add(IntegerPartition.partitions(++k)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
