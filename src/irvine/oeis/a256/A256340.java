package irvine.oeis.a256;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A256340 Numbers which have only digits 7 and 8 in base 10.
 * @author Georg Fischer
 */
public class A256340 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN).substring(1).replace('1', '8').replace('0', '7'));
  }
}
