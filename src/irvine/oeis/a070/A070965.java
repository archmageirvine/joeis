package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A070964.
 * @author Sean A. Irvine
 */
public class A070965 extends CachedSequence {

  /** Construct the sequence. */
  public A070965() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Integers.SINGLETON.sumdiv(n - 1, d -> self.a(d).multiply(Functions.MOBIUS.l(d))));
  }
}
