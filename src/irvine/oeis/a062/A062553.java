package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062553 Number of Abelian subgroups of the dihedral group with 2n elements.
 * @author Sean A. Irvine
 */
public class A062553 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z sigma0 = Functions.SIGMA0.z(++mN);
    return sigma0.add((mN & 1) == 1 ? mN : 3 * mN / 2);
  }
}

