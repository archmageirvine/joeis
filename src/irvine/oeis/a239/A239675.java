package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A239675 Least k <code>&gt; 0</code> such that <code>p(n)+k</code> is prime, where <code>p(n)</code> is the number of partitions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A239675 extends A000041 {

  @Override
  public Z next() {
    final Z pn = super.next();
    long k = 0;
    while (true) {
      if (pn.add(++k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
