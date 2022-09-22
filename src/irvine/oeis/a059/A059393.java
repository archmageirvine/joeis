package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a207.A207975;

/**
 * A059393 Smallest possible sum of n positive integers g(1) &lt; g(2) &lt; ... &lt; g(n) such that A001222(g(i)+g(j))=A001222(g(i))+A001222(g(j)) for all 1&lt;=i&lt;j&lt;=n.
 * @author Sean A. Irvine
 */
public class A059393 extends A207975 {

  @Override
  public Z next() {
    step();
    return Z.valueOf(mBest);
  }
}
