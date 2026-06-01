package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395712 Number of valid manual turn-on sequences for n computers in a line, where a computer turns on automatically if its two neighbors are already on.
 * @author Sean A. Irvine
 */
public class A395712 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, (++mN + 1) / 2, k -> Functions.FACTORIAL.z(k).multiply(Functions.STIRLING2.z(mN - k + 1, k)).shiftLeft(mN - 2 * k + 1));
  }
}

