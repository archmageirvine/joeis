package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a003.A003288;

/**
 * A005398 Number of n-step polygons on f.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A005398 extends A003288 {

  @Override
  protected long search() {
    return search(0, 0, 0, 1, 1, 0, mN, 3);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(search()).multiply2().divide(mN + 1);
  }

}
