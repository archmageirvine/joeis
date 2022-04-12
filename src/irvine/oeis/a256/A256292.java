package irvine.oeis.a256;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A256292 Numbers which have only digits 6 and 7 in base 10.
 * @author Georg Fischer
 */
public class A256292 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN).substring(1).replace('1', '7').replace('0', '6'));
  }
}
