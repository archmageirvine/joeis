package irvine.oeis.a078;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A078346 a(1) = 1; a(n) = Sum_{k=1..n-1} a(floor((n-1)/k)).
 * @author Sean A. Irvine
 */
public class A078346 extends CachedSequence {

  /** Construct the sequence. */
  public A078346() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Integers.SINGLETON.sum(1, n - 1, k -> self.a((n - 1) / k)));
  }
}

