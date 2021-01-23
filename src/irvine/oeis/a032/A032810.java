package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032810 Numbers using only digits 2 and 3.
 * @author Sean A. Irvine
 */
public class A032810 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN).substring(1).replace('1', '3').replace('0', '2'));
  }
}
