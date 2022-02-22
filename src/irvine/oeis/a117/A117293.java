package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;
import irvine.util.string.StringUtils;

/**
 * A117293 Mersenne primes written in binary.
 * @author Georg Fischer
 */
public class A117293 extends A000043 {

  @Override
  public Z next() {
    return new Z(StringUtils.rep('1', super.next().intValue()));
  }
}
