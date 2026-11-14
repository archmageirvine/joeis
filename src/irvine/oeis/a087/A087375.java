package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A087375 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(++mN).root(mN).add(1).pow(mN);
  }
}

