package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.a006.A006905;

/**
 * A395037 Number of relations on an n-set that are not transitive.
 * @author Sean A. Irvine
 */
public class A395037 extends A006905 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN * mN).subtract(super.next());
  }
}
