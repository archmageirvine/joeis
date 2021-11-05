package irvine.oeis.a052;

import java.util.Collections;
import java.util.HashSet;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052297 Number of distinct prime factors of all composite numbers between n-th and (n+1)st primes.
 * @author Sean A. Irvine
 */
public class A052297 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    Z s = mP.add(1);
    mP = super.next();
    final HashSet<Z> seen = new HashSet<>();
    while (!s.equals(mP)) {
      Collections.addAll(seen, Cheetah.factor(s).toZArray());
      s = s.add(1);
    }
    return Z.valueOf(seen.size());
  }
}
