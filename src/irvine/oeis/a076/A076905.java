package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076905 extends CachedSequence {

  /** Construct the sequence. */
  public A076905() {
    super(1, Integer.class, (self, n) -> n == 1
      ? Z.ONE
      : Z.valueOf(n).subtract(self.a(n - 1)).add(self.a(self.a(n - 1))).subtract(self.a(self.a(self.a(n - 1)))));
  }
}
