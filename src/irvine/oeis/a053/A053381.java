package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a209.A209675;

/**
 * A053381 Maximal number of linearly independent smooth nowhere-zero vector fields on a (2n+1)-sphere.
 * @author Sean A. Irvine
 */
public class A053381 extends A209675 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
