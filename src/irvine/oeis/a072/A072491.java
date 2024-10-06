package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A072491 Define f(1) = 0. For n&gt;=2, let f(n) = n - p where p is the largest prime &lt;= n. a(n) = number of iterations of f to reach 0, starting from n.
 * @author Sean A. Irvine
 */
public class A072491 extends CachedSequence {

  /** Construct the sequence. */
  public A072491() {
    super(0, Integer.class, (self, k) -> k < 4 ? (k > 0 ? Z.ONE : Z.ZERO) : self.a(k - Functions.PREV_PRIME.i(k + 1)).add(1));
  }
}

