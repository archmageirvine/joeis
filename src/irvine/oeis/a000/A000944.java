package irvine.oeis.a000;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000944 Number of polyhedra (or 3-connected simple planar graphs) with n nodes.
 * @author Sean A. Irvine
 */
public class A000944 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ZERO;
    }
    return Z.valueOf(new Plantri().count(mN, -1, -1, -1, false, true, false, false));
  }

}

