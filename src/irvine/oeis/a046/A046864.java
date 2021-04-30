package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046864 Smallest number whose digits sum to n-th prime.
 * @author Sean A. Irvine
 */
public class A046864 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    final long r = p % 9;
    final StringBuilder sb = new StringBuilder();
    sb.append(r);
    for (long k = 0; k < p / 9; ++k) {
      sb.append('9');
    }
    return new Z(sb);
  }
}
