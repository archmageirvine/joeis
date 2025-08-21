package irvine.oeis.a079;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A079580 a(n)= Sum_{d divides n} a(abs(n/d-d)).
 * @author Sean A. Irvine
 */
public class A079580 extends CachedSequence {

  /** Construct the sequence. */
  public A079580() {
    super(0, Integer.class, (self, n) -> n <= 1 ? Z.ONE : Integers.SINGLETON.sumdiv(n, d -> self.a(Math.abs(n / d - d))));
  }
}
