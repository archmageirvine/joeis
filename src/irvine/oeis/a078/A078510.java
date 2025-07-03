package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a265.A265409;

/**
 * A078510 Spiro-Fibonacci numbers, a(n) = sum of two previous terms that are nearest when terms arranged in a spiral.
 * @author Sean A. Irvine
 */
public class A078510 extends CachedSequence {

  private static final DirectSequence A265409 = new A265409();

  /** Construct the sequence. */
  public A078510() {
    super(0, Integer.class, (self, n) -> n <= 1 ? Z.valueOf(n) : self.a(n - 1).add(self.a(A265409.a(n))));
  }
}

