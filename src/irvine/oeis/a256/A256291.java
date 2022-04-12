package irvine.oeis.a256;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A256291 Numbers which have only digits 5 and 6 in base 10.
 * @author Georg Fischer
 */
public class A256291 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN).substring(1).replace('1', '6').replace('0', '5'));
  }
}
