package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072961 Numbers using only the digits 2 and 5, that are both curved and straight.
 * @author Sean A. Irvine
 */
public class A072961 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN).substring(1).replace('1', '5').replace('0', '2'));
  }
}
