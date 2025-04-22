package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A076897 a(1)=1, a(n)=n-a(floor(3n/4)).
 * @author Sean A. Irvine
 */
public class A076897 extends CachedSequence {

  /** Construct the sequence. */
  public A076897() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Z.valueOf(n).subtract(self.a(3 * n / 4)));
  }
}
