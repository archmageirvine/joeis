package irvine.oeis.a086;

import java.util.Collections;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a051.A051424;

/**
 * A086191 Number of partitions of primes into mutual coprimes &gt; 1.
 * @author Sean A. Irvine
 */
public class A086191 extends A051424 {

  private final Sequence mP = new A000040();

  @Override
  public Z next() {
    final long p = mP.next().longValueExact();
    return b(p, p, Collections.emptySet())
      .subtract(b(p - 1, p - 1, Collections.emptySet()));
  }
}
