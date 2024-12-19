package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A073776 a(n) = Sum_{k=1..n} -mu(k+1) * a(n-k), with a(0)=1.
 * @author Sean A. Irvine
 */
public class A073776 extends CachedSequence {

  /** Construct the sequence. */
  public A073776() {
    super(0, Integer.class, (self, n) -> n == 0 ? Z.ONE : Integers.SINGLETON.sum(1, n, k -> self.a(n - k).multiply(-Functions.MOBIUS.l(k + 1))));
  }
}
