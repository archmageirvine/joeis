package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A070868 a(1) = a(2) = 1; a(n) = a(a(n-1)) + a(n+1 - 2*a(n-1)).
 * @author Sean A. Irvine
 */
public class A070868 extends CachedSequence {

  /** Construct the sequence. */
  public A070868() {
    super(1, Integer.class, (self, n) -> n <= 2 ? Z.ONE : self.a(self.a(n - 1).intValueExact()).add(self.a(n + 1 - self.a(n - 1).multiply2().intValueExact())));
  }
}
