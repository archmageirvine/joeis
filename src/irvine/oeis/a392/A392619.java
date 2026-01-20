package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083264.
 * @author Sean A. Irvine
 */
public class A392619 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Q(Functions.FACTORIAL.z(++mN).square().shiftLeft(mN), Functions.FACTORIAL.z(2 * mN + 1)).square().den();
  }
}

