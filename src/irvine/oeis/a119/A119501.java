package irvine.oeis.a119;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A119501 Number of isomorphism classes of 3-connected simple planar graphs (convex polytopes) where isomorphism does not allow reflection.
 * @author Sean A. Irvine
 */
public class A119501 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ZERO;
    }
    return Z.valueOf(new Plantri().count(mN, -1, -1, -1, true, true, false, false));
  }

}

