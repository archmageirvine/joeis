package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063073 Square of determinant of character table of the dihedral group with 2n elements.
 * @author Sean A. Irvine
 */
public class A063073 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow((mN + 2) / 2).shiftLeft((mN & 1) == 0 ? 6 : 2);
  }
}

