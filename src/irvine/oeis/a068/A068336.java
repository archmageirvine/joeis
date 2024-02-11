package irvine.oeis.a068;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A068334 a(1) = 1; a(n+1) = 1 + Product_{k|n} a(k), product is over the positive divisors, k, of n.
 * @author Sean A. Irvine
 */
public class A068336 extends CachedSequence {

  /** Construct the sequence. */
  public A068336() {
    super(1, Integer.class, (self, k) -> k == 1 ? Z.ONE : Integers.SINGLETON.sumdiv(k - 1, self::a).add(1));
  }
}
