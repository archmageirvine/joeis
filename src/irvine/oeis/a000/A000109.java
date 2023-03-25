package irvine.oeis.a000;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A000109 Number of simplicial polyhedra with n vertices; simple planar graphs with n vertices and 3n-6 edges; maximal simple planar graphs with n vertices; planar triangulations with n vertices; triangulations of the sphere with n vertices; 3-connected cubic planar graphs on 2n-4 vertices.
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

