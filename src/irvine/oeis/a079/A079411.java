package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A079411 a(1)=1, a(n) = n - a(a(ceiling(n/2))).
 * @author Sean A. Irvine
 */
public class A079411 extends CachedSequence {

  /** Construct the sequence. */
  public A079411() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Z.valueOf(n).subtract(self.a(self.a((n + 1) / 2))));
  }
}

