package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A392473 a(0) = 0, a(1) = 1; otherwise, a(n) = a(n-1) + a(m), where m is the greatest square &lt; n.
 * @author Sean A. Irvine
 */
public class A392473 extends CachedSequence {

  /** Construct the sequence. */
  public A392473() {
    super(0, Integer.class, (self, n) -> n <= 1 ? Z.valueOf(n) : self.a(n - 1).add(self.a(Functions.SQRT.z(n - 1).square())));
  }
}

