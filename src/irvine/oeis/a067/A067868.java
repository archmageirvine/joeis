package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A067868 a(n) = a(n-1) + a(floor(n/2))^2 for n &gt; 0, a(0) = 1.
 * @author Sean A. Irvine
 */
public class A067868 extends CachedSequence {

  /** Construct the sequence. */
  public A067868() {
    super(0, Integer.class, (self, n) -> n == 0 ? Z.ONE : self.a(n - 1).add(self.a(n / 2).square()));
  }
}
