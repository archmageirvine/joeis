package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A076502 a(1)=1, a(n)=n-a(n-a(n-a(n-1))).
 * @author Sean A. Irvine
 */
public class A076502 extends CachedSequence {

  /** Construct the sequence. */
  public A076502() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Z.valueOf(n - self.a(n - self.a(n - self.a(n - 1).intValueExact()).intValueExact()).intValueExact()));
  }
}
