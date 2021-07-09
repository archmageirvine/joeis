package irvine.oeis.a132;
// manually 2021-07-09

import irvine.math.z.Z;
import irvine.oeis.a140.A140758;

/**
 * A132222 Beatty sequence 1+2*floor(n*Pi/2), which contains infinitely many primes.
 * a(n) = 1 + 2*A140758(n)
 * @author Georg Fischer
 */
public class A132222 extends A140758 {

  @Override
  public Z next() {
    return super.next().multiply2().add(Z.ONE);
  }
}
