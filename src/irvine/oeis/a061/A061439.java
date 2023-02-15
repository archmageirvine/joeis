package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061439 Largest number whose cube has n digits.
 * @author Sean A. Irvine
 */
public class A061439 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.TEN.pow(++mN).subtract(1).root(3);
  }
}

