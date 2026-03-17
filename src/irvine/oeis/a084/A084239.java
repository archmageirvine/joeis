package irvine.oeis.a084;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a067.A067059;

/**
 * A084239 Rank of K-groups of Furstenberg transformation group C*-algebras of n-torus.
 * @author Sean A. Irvine
 */
public class A084239 extends A067059 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> super.next());
  }
}
