package irvine.oeis.a073;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A073144 Smallest m such that the 'Reverse and Subtract' trajectory (cf. A072137) of m leads to A073142(n).
 * @author Sean A. Irvine
 */
public class A073144 extends A073142 {

  // This is a terrible implementation

  private boolean is(final long n, final long target) {
    long m = n;
    final long t = n / 10;
    final Set<Long> seen = new HashSet<>();
    do {
      m = Math.abs(m - Functions.REVERSE.l(m));
      if (m == target) {
        return true;
      }
      if (m <= t) {
        return false;
      }
    } while (m != 0 && seen.add(m));
    return false;
  }

  @Override
  public Z next() {
    final long target = super.next().longValueExact();
    long k = -1;
    while (true) {
      if (is(++k, target)) {
        return Z.valueOf(k);
      }
    }
  }
}
