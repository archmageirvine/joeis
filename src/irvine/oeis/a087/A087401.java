package irvine.oeis.a087;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A087401 Triangle of n*r-binomial(r+1, 2). 
 * @author Georg Fischer
 */
public class A087401 extends Triangle {

  /** Construct the sequence. */
  public A087401() {
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ZERO : Z.valueOf(n).multiply(Z.valueOf(k)).subtract(Binomial.binomial(k + 1, 2));
  }
}
