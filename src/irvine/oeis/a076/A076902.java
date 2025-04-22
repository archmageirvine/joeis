package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A076902 a(1)=1, a(n) = floor(n/2) - a(floor(n/2)).
 * @author Sean A. Irvine
 */
public class A076902 extends CachedSequence {

  /** Construct the sequence. */
  public A076902() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Z.valueOf(n / 2).subtract(self.a(n / 2)));
  }
}
