package irvine.oeis.a079;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A079512 a(0)=1, a(1)=1; for n&gt;1, a(n) = Sum_{i=0..n/2} binomial(n-i-1,i)*a(n-2i-1) + ((n+1) mod 2).
 * @author Sean A. Irvine
 */
public class A079512 extends CachedSequence {

  /** Construct the sequence. */
  public A079512() {
    super(0, Integer.class, (self, n) -> n <= 1 ? Z.ONE : Integers.SINGLETON.sum(0, n / 2, k -> Binomial.binomial(n - k - 1, k).multiply(self.a(n - 2 * k - 1))).add((n + 1) & 1));
  }
}
