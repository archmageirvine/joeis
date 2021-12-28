package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A053444 x^2 + y^2 mod A053443(n) does not take on value a(n).
 * @author Sean A. Irvine
 */
public class A053444 extends A053443 {

  @Override
  public Z next() {
    final long mod = super.next().longValueExact();
    final TreeSet<Long> seen = new TreeSet<>();
    for (long x = 0; x < mN; ++x) {
      for (long y = 0; y <= x; ++y) {
        seen.add((x * x + y * y) % mod);
      }
    }
    long k = 0;
    while (!seen.isEmpty() && seen.pollFirst() == k) {
      ++k;
    }
    return Z.valueOf(k);
  }
}

