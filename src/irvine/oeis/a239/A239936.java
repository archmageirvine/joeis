package irvine.oeis.a239;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A239936 Least k <code>&gt; 0</code> such that <code>p(k)+q(n)</code> is prime, where <code>p(n)</code> is the number of partitions of n and <code>q(n)</code> is the number of strict partitions of <code>n</code>.
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
