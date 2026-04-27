package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A087655 a(n) = a(abs(n - a(n-1))) + a(abs(n - a(n-2))) + a(abs(n - a(n-3))) with a(1)=a(2)=a(3)=1.
 * @author Sean A. Irvine
 */
public class A087655 extends CachedSequence {

  /** Construct the sequence. */
  public A087655() {
    super(1, Long.class, (self, n) -> {
      if (n <= 3) {
        return Z.ONE;
      }
      return self.a(Math.abs(n - self.a(n - 1).longValueExact()))
        .add(self.a(Math.abs(n - self.a(n - 2).longValueExact())))
        .add(self.a(Math.abs(n - self.a(n - 3).longValueExact())));
    });
  }
}
