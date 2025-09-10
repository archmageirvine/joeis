package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080228 Numbers containing the digits 0, 1, 2, 5 or 8 only.
 * @author Sean A. Irvine
 */
public class A080228 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 5).replace('4', '8').replace('3', '5'));
  }
}

