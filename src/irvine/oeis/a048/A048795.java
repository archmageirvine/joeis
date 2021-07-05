package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048795 Concatenate p p times, where p runs through the primes.
 * @author Sean A. Irvine
 */
public class A048795 extends A000040 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < p; ++k) {
      sb.append(p);
    }
    return new Z(sb);
  }
}
