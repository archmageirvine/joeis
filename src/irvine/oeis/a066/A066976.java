package irvine.oeis.a066;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A066976 a(0) = 1; for n&gt;0: a(n) = sum{a(i)*n^i : 0&lt;=i&lt;n}.
 * @author Sean A. Irvine
 */
public class A066976 extends CachedSequence {

  /** Construct the sequence. */
  public A066976() {
    super(0, Integer.class, (self, k) -> k == 0 ? Z.ONE : Integers.SINGLETON.sum(0, k - 1, j -> self.a(j).multiply(Z.valueOf(k).pow(j))));
  }
}
