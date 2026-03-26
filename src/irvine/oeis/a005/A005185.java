package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A005185 Hofstadter Q-sequence: a(1) = a(2) = 1; a(n) = a(n-a(n-1)) + a(n-a(n-2)) for n &gt; 2.
 * @author Sean A. Irvine
 */
public class A005185 extends CachedSequence {

  /** Construct the sequence. */
  public A005185() {
    super(1, Long.class, (self, n) -> n <= 2 ? Z.ONE : self.a(n - self.a(n - 1).intValueExact()).add(self.a(n - self.a(n - 2).intValueExact())));
  }
}
