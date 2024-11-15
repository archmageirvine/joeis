package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A073059 a(n) = (1/2)*(A073504(n+1) - A073504(n)).
 * @author Sean A. Irvine
 */
public class A073059 extends CachedSequence {

  /** Construct the sequence. */
  public A073059() {
    super(1, Integer.class, (self, n) -> {
      if ((n & 1) == 0) {
        return Z.ZERO;
      } else if ((n & 3) == 3) {
        return Z.ONE;
      } else {
        return self.a(n >> 2);
      }
    });
  }
}
