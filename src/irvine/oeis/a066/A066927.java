package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066927 Least k such that between p and 2p, for all primes &gt; 3, there is always a number that is twice a square, i.e.; a k such that p &lt; 2k^2 &lt; 2p.
 * @author Sean A. Irvine
 */
public class A066927 extends A000040 {

  @Override
  public Z next() {
    return super.next().divide2().sqrt().add(1);
  }
}
