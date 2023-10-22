package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a014.A014076;

/**
 * A047845 a(n) = (m-1)/2, where m is the n-th odd nonprime (A014076(n)).
 * @author Sean A. Irvine
 */
public class A047845 extends A014076 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
