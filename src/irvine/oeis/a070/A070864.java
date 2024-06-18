package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A070837.
 * @author Sean A. Irvine
 */
public class A070864 extends CachedSequence {

  /** Construct the sequence. */
  public A070864() {
    super(1, Integer.class, (self, n) -> n <= 2 ? Z.ONE : Z.TWO.add(self.a(n - self.a(n - 1).intValueExact())));
  }
}
