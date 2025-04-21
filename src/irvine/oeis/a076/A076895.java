package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076895 extends CachedSequence {

  /** Construct the sequence. */
  public A076895() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Z.valueOf(n).subtract(self.a((n + 1) / 2)));
  }
}
