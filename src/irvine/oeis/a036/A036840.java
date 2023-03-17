package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036840 a(n) is the average of the repeating terms of {T(n,k)} rounded to the nearest integer (rounding up if there's a choice), if {T(n,k)} is eventually periodic; = 0 otherwise. Here T(n,k) is the "phi/sigma tug-of-war sequence with seed n" defined by T(n,1) = phi(n), T(n,2) = sigma(phi(n)), T(n,3) = phi(sigma(phi(n))), ..., T(n,k) = phi(T(n,k-1)) if k is odd and = sigma(T(n,k-1)) if k is even.
 * @author Sean A. Irvine
 */
public class A036840 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final TreeSet<Z> seen = new TreeSet<>();
    // Run up, until cycle detected (assumes there always will be a cycle)
    boolean phi = true;
    Z m = mN;
    while (seen.add(m)) {
      if (phi) {
        m = Euler.phi(m);
        phi = false;
      } else {
        m = Jaguar.factor(m).sigma();
        phi = true;
      }
    }
    // Sum the cycle
    final Z end = m;
    Z sum = Z.ZERO;
    long cnt = 0;
    do {
      if (phi) {
        m = Euler.phi(m);
        phi = false;
      } else {
        m = Jaguar.factor(m).sigma();
        phi = true;
      }
      sum = sum.add(m);
      ++cnt;
    } while (!m.equals(end));
    return new Q(sum, Z.valueOf(cnt)).round();
  }
}
