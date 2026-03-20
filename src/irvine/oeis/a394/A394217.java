package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A394217 Earliest monotonic sequence satisfying a(1)=1 and a(a(n)+a(n-1))=n for n&gt;=1 (with a(k)=0 for k&lt;=0).
 * @author Sean A. Irvine
 */
public class A394217 extends CachedSequence {

  /** Construct the sequence. */
  public A394217() {
    super(1, Long.class, (self, n) -> n <= 3 ? n == 1 ? Z.ONE : Z.TWO : self.a(n / 2).add(self.a(n / 2 + 1)).subtract(1 - (n & 1)));
  }
}
