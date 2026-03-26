package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A394051 allocated for Marco Mantovanelli.
 * @author Sean A. Irvine
 */
public class A394051 extends CachedSequence {

  /** Construct the sequence. */
  public A394051() {
    super(1, Long.class, (self, n) -> n <= 2 ? Z.ONE : self.a(n - self.a(n - 1).longValueExact()).add(self.a(n - self.a(n - 2).longValueExact())).add(Z.NEG_ONE.pow(n)));
  }
}
