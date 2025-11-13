package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A081831 a(1)=a(2)=1, a(n) = a(a(n - a(n-1))) + a(n - a(n-2)).
 * @author Sean A. Irvine
 */
public class A081831 extends CachedSequence {

  /** Construct the sequence. */
  public A081831() {
    super(1, Integer.class, (self, n) -> n <= 2 ? Z.ONE : self.a(self.a(n - self.a(n - 1).intValueExact())).add(self.a(n - self.a(n - 2).intValueExact())));
  }
}
