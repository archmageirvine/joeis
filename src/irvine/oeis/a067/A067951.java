package irvine.oeis.a067;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A067851.
 * @author Sean A. Irvine
 */
public class A067951 extends CachedSequence {

  /** Construct the sequence. */
  public A067951() {
    super(0, Integer.class, (self, n) -> n == 0
      ? Z.ONE
      : Integers.SINGLETON.sumdiv(n, k -> self.a(n - k)));
  }
}
