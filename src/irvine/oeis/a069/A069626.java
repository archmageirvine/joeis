package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069626 Number of sets of integers larger than one whose least common multiple is n.
 * @author Sean A. Irvine
 */
public class A069626 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Functions.MOBIUS.z(mN / d).shiftLeft(Functions.SIGMA0.l(d) - 1));
  }
}
