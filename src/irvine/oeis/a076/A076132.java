package irvine.oeis.a076;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A076132 a(1) = 1; for n &gt; 1, a(n) = Sum{a(n-k)^k | 0&lt;k&lt;n}.
 * @author Sean A. Irvine
 */
public class A076132 extends CachedSequence {

  /** Construct the sequence. */
  public A076132() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Integers.SINGLETON.sum(1, n - 1, k -> self.a(n - k).pow(k)));
  }
}
