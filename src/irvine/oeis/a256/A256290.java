package irvine.oeis.a256;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A256290 Numbers which have only digits 4 and 5 in base 10.
 * @author Georg Fischer
 */
public class A256290 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN).substring(1).replace('1', '5').replace('0', '4'));
  }
}
