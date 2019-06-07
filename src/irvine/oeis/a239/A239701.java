package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A239701 Least k <code>&gt; 0</code> such that <code>q(n)+k</code> is prime, where <code>q(n)</code> is the number of strict partitions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A239701 extends A000009 {

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
