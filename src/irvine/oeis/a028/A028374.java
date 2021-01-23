package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028374 Curved numbers: numbers that have only curved digits (0, 2, 3, 5, 6, 8, 9).
 * @author Sean A. Irvine
 */
public class A028374 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 7).replace('6', '9').replace('5', '8').replace('4', '6').replace('3', '5').replace('2', '3').replace('1', '2'));
  }
}
