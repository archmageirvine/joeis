package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076896 extends CachedSequence {

  /** Construct the sequence. */
  public A076896() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Z.valueOf(n).subtract(self.a(2 * n / 3)));
  }
}
