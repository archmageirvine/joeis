package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072491 extends CachedSequence {

  /** Construct the sequence. */
  public A072491() {
    super(0, Integer.class, (self, k) -> k < 4 ? (k > 0 ? Z.ONE : Z.ZERO) : self.a(k - Functions.PREV_PRIME.i(k + 1)).add(1));
  }
}

