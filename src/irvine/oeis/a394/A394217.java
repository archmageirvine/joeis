package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A394217 allocated for Benoit Cloitre.
 * @author Sean A. Irvine
 */
public class A394217 extends CachedSequence {

  /** Construct the sequence. */
  public A394217() {
    super(1, Long.class, (self, n) -> n <= 3 ? n == 1 ? Z.ONE : Z.TWO : self.a(n / 2).add(self.a(n / 2 + 1)).subtract(1 - (n & 1)));
  }
}
