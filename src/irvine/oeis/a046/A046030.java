package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046030 Numbers whose digits are squares.
 * @author Sean A. Irvine
 */
public class A046030 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 4).replace('3', '9').replace('2', '4'));
  }
}
