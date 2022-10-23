package irvine.oeis.a000;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A000109 Number of simplicial polyhedra with n nodes; simple planar graphs with 3n-6 edges; maximal simple planar graphs; 3-connected planar triangulations; 3-connected triangulations of the sphere; 3-connected cubic planar graphs.
 * @author Sean A. Irvine
 */
public class A000109 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.ONE;
    }
    return Z.valueOf(new Plantri().count(mN, -1, -1, -1, false, false, false, false));
  }

}

