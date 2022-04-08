package irvine.oeis.a124;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A124051 Quasi-mirror of A062196 formatted as a triangular array.
 * Maple: <code>for n from 0 to 10 do seq(binomial(n, i-1)*binomial(n+2, n+1-i), i=1..n ) od;</code>
 * @author Georg Fischer
 */
public class A124051 extends Triangle {

  /** Construct the sequence. */
  public A124051() {
    hasRAM(true);
  }

  @Override
  public Z compute(int n, int i) {
    ++n;
    ++i;
    return n == 1 ? Z.THREE : Binomial.binomial(n, i - 1).multiply(Binomial.binomial(n + 2, n + 1 - i));
  }
}
