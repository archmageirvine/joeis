package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026671 Number of lattice paths from <code>(0,0)</code> to <code>(n,n)</code> with steps <code>(0,1), (1,0)</code> and, when on the diagonal, <code>(1,1)</code>.
 * @author Sean A. Irvine
 */
public class A026671 extends A026670 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
