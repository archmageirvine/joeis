package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A075825 a(0) = 1, a(1) = 2; for n&gt;0, a(2n) = |a(n)-a(n-1)|, a(2n+1) = a(n)+a(n-1).
 * @author Sean A. Irvine
 */
public class A075825 extends CachedSequence {

  /** Construct the sequence. */
  public A075825() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      if (n == 1) {
        return Z.TWO;
      }
      if ((n & 1) == 0) {
        return self.a(n / 2).subtract(self.a(n / 2 - 1)).abs();
      } else {
        return self.a(n / 2).add(self.a(n / 2 - 1));
      }
    });
  }
}
