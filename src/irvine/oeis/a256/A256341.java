package irvine.oeis.a256;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A256341 Numbers which have only digits 8 and 9 in base 10.
 * @author Georg Fischer
 */
public class A256341 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN).substring(1).replace('1', '9').replace('0', '8'));
  }
}
