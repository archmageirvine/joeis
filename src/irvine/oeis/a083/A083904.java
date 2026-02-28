package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A083904 Expansion of g.f. 1/(1-x) * Sum_{k&gt;=0} 3^k * x^2^(k+1)/(1+x^2^k).
 * @author Sean A. Irvine
 */
public class A083904 extends CachedSequence {

  /** Construct the sequence. */
  public A083904() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ZERO : self.a(n / 2).multiply(3).add(1 - (n & 1)));
  }
}

