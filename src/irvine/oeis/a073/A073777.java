package irvine.oeis.a073;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a068.A068341;

/**
 * A073777 a(n) = Sum_{k=1..n} -A068341(k+1)*a(n-k), a(0)=1.
 * @author Sean A. Irvine
 */
public class A073777 extends CachedSequence {

  private static final DirectSequence A068341 = DirectSequence.create(new A068341());

  /** Construct the sequence. */
  public A073777() {
    super(0, Integer.class, (self, n) -> n == 0 ? Z.ONE : Integers.SINGLETON.sum(1, n, k -> self.a(n - k).multiply(A068341.a(k + 1)).negate()));
  }
}
