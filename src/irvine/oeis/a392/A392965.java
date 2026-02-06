package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a000.A000522;

/**
 * A392965 Least number of vertices in a stepwise-irregular tree with at least one vertex of degree n.
 * @author Sean A. Irvine
 */
public class A392965 extends A000522 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.ONE.add((++mN <= 1 ? Z.ONE : super.next()).multiply(mN));
  }
}
