package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072960 Numbers using only the curved digits 0, 3, 6, 8 and 9.
 * @author Sean A. Irvine
 */
public class A072960 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 5).replace('4', '9').replace('3', '8').replace('2', '6').replace('1', '3'));
  }
}

