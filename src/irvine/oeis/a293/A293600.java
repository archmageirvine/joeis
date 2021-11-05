package irvine.oeis.a293;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A293600 G.f. A(x,y) = Sum_{-oo..+oo} (x - y^n)^(n+1), as a flattened rectangular array of coefficients T(n,k) of x^n * y^(k*(n+k-1)) in A(x,y) for n&gt;=1.
 * @author Georg Fischer
 */
public class A293600 extends Triangle {

  /** Construct the sequence. */
  public A293600() {
    super("1, 1,-2");
  }

  @Override
  public Z compute(final int n, final int k) {
    if (n < 2) {
      return super.compute(n, k);
    } else {
      final Z result = get(n - 1, k - 1).abs().add(get(n - 1, k).abs());
      return (k & 1) == 1 ? result.negate() : result;
    }
  }
}
