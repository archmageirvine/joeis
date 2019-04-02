package irvine.oeis.a007;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007021 Number of 4-connected simplicial polyhedra with n nodes.
 * @author Sean A. Irvine
 */
public class A007021 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    if (++mN < 6) {
      return Z.ONE;
    }
    return Z.valueOf(new Plantri().count(mN, -1, 4, -1, false, false, false, false));
  }

}

