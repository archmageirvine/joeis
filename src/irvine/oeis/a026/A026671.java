package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026671 Number of lattice paths from (0,0) to (n,n) with steps (0,1), (1,0) and, when on the diagonal, (1,1).
 * @author Sean A. Irvine
 */
public class A026671 extends A026670 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
