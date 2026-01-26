package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391618 allocated for Aitzaz Imtiaz.
 * @author Sean A. Irvine
 */
public class A391618 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((Functions.SQRT.l(mN++) + 1) / 2);
  }
}
