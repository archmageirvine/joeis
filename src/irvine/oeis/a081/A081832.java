package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A081832 a(1)=a(2)=1, a(n) = a(n+1-2*a(n-1)) + a(n-2*a(n-2)).
 * @author Sean A. Irvine
 */
public class A081832 extends CachedSequence {

  /** Construct the sequence. */
  public A081832() {
    super(1, Integer.class, (self, n) -> n <= 2 ? Z.ONE : self.a(n + 1 - self.a(n - 1).multiply2().intValueExact()).add(self.a(n - self.a(n - 2).multiply2().intValueExact())));
  }
}
