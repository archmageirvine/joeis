package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008893 Number of equilateral triangles formed by triples of points taken from a hexagonal chunk of side n in the hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A008893 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.SEVEN.multiply(++mN).add(7).multiply(mN).add(2).multiply(mN).multiply(mN + 1).divide(4);
  }
}


