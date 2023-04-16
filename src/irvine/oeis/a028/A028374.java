package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028374 Numbers that have only curved digits {0, 3, 6, 8, 9} or digits that are both curved and linear {2, 5}.
 * @author Sean A. Irvine
 */
public class A028374 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 7).replace('6', '9').replace('5', '8').replace('4', '6').replace('3', '5').replace('2', '3').replace('1', '2'));
  }
}
