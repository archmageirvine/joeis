package irvine.oeis.a193;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A193973 Triangular array:  the fission of (p(n,x)) by (q(n,x)), where p(n,x)=x*p(n-1,x)+n+1 with p(0,x)=1, and q(n,x)=x*p(n-1,x)+1 with p(0,x)=1.
 * @author Georg Fischer
 */
public class A193973 extends Triangle {

  /** Construct the sequence. */
  public A193973() {
    hasRAM(true);
  }

  private Z triang(final int n) {
    return Z.valueOf(n * (n + 1) / 2);
  }

  @Override
  public Z compute(final int n, final int k) {
    return triang(n + 2).subtract(triang(n + 1 - k));
  }
}
