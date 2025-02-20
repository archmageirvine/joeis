package irvine.oeis.a075;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A075496 a(1)=1, a(n) = Sum_{k=1..n-1} max(a(k), a(n-k)).
 * @author Sean A. Irvine
 */
public class A075496 extends CachedSequence {

  /** Construct the sequence. */
  public A075496() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Integers.SINGLETON.sum(1, n - 1, k -> self.a(k).max(self.a(n - k))));
  }
}

